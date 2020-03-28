package cn.sys.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.sys.entity.Admin;
import cn.sys.entity.AdminExample;
import cn.sys.service.AdminService;
import cn.sys.utils.PageResult;
import cn.sys.utils.Result;

@RestController
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminService AdminService;
	
	/*@RequestMapping("findAll")
	public List<Admin> findALl(){
		return AdminService.findAll();
	}
	*/
	
	
	@RequestMapping("login")
	public Result login(HttpServletRequest request ,Admin Admin){
		try {
			Admin existAdmin = this.AdminService.login(Admin);
			if(existAdmin!=null){
				request.getSession().setAttribute("admin", existAdmin);
				return new Result(true, "成功");
			}else{
				return new Result(false, "失败");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("add")
	public Result add(Admin Admin ){
		try {
			if(Admin.getId()==null){
				
				this.AdminService.add(Admin);
			}else{
				this.AdminService.update(Admin);
			}
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("findPage")
	public PageResult findPage(Admin Admin,Integer page,Integer rows){
		AdminExample example = new AdminExample();
		PageResult PageResult = AdminService.findPage(example,page,rows);
		return PageResult;
	}

	@RequestMapping("findOne")
	public Admin findOne(Integer id){
		Admin Admin = this.AdminService.findOne(id);
		return Admin;
	}
	
	@RequestMapping("update")
	public Result update( Admin Admin){
		try {
			this.AdminService.update(Admin);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	@RequestMapping(value="delete")
	public Result delete(String ids,Integer a){
		
		try {
			for (String id : ids.split(",")) {
				this.AdminService.delete(Integer.parseInt(id));
			}
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	} 
	
}
