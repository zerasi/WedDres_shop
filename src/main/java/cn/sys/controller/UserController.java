package cn.sys.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.sys.entity.User;
import cn.sys.entity.UserExample;
import cn.sys.service.UserService;
import cn.sys.utils.PageResult;
import cn.sys.utils.Result;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("findAll")
	public List<User> findALl(){
		return userService.findAll();
	}
	
	@RequestMapping("add")
	public Result add(User User){
		try {
			if(User.getId()==null){
				this.userService.add(User);
			}else{
				this.userService.update(User);
			}
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	@RequestMapping("userEdit")
	public Result userEdit( HttpServletRequest request,User User){
		try {
			
			this.userService.update(User);
			request.getSession().setAttribute("user", User);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("add2")
	public Result add2(HttpServletRequest request,User User){
		try {
			this.userService.update(User);
			request.getSession().setAttribute("user", User);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("login")
	public Result login(HttpServletRequest request ,User User){
		try {
			UserExample example = new UserExample();
			example.createCriteria().andUsernameEqualTo(User.getUsername()).andPasswordEqualTo(User.getPassword());
			User existUser = this.userService.login(example);
			if(existUser==null){
				return new Result(false, "添加失败");
			}
			request.getSession().setAttribute("user", existUser);
			return new Result(true, "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "添加失败");
		}
	}
	
	@RequestMapping("logout")
	public Result logout(HttpServletRequest request){
		try {
			request.getSession().setAttribute("user", null);
			return new Result(true, "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "添加失败");
		}
	}
	
	
	@RequestMapping("zhanshi")
	public User zhanshi(HttpServletRequest request){
		Map<String ,Object> map = new HashedMap();
		User user = (User) request.getSession().getAttribute("user");
		return user;
	}
	
	@RequestMapping("findPage")
	public PageResult findPage(User User,Integer page,Integer rows){
		UserExample example = new UserExample();
		
		return this.userService.findPage(example,page,rows);
	}
	
	@RequestMapping("findOne")
	public User findOne(Integer id){
		User User = this.userService.findOne(id);
		return User;
	}
	
	@RequestMapping("update")
	public Result update( User User){
		try {
			this.userService.update(User);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	
	@RequestMapping(value="delete")
	public Result delete(String ids){
		
		try {
			for (String id : ids.split(",")) {
				this.userService.delete(Integer.parseInt(id));
			}
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	} 
	
	@RequestMapping("search")
	public PageResult search( User User, Integer page, Integer rows){
		return this.findPage(User,page, rows);
	}
}
