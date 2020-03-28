package cn.sys.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.sys.entity.Category;
import cn.sys.entity.CategoryExample;
import cn.sys.service.CategoryService;
import cn.sys.utils.PageResult;
import cn.sys.utils.Result;

@RestController
@RequestMapping("category")
public class CategoryController {
	
	@Autowired
	private CategoryService CategoryService;
	
	@RequestMapping("findAll")
	public List<Category> findALl(){
		return CategoryService.findAll(new CategoryExample());
	}
	
	@RequestMapping("findAllfive")
	public List<Category> findAllfive(){
		return CategoryService.findAllfive(new CategoryExample());
	}
	
	@RequestMapping("add")
	public Result add(Category Category){
		try {
			if(Category.getId()==null){
				this.CategoryService.add(Category);
			}else{
				this.CategoryService.update(Category);
			}
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("findPage")
	public PageResult findPage(Category category,Integer page,Integer rows){
		CategoryExample example = new CategoryExample();
		return this.CategoryService.findPage(example,page,rows);
	}
	
	@RequestMapping("findOne")
	public Category findOne(Integer id){
		Category Category = this.CategoryService.findOne(id);
		return Category;
	}
	
	@RequestMapping("update")
	public Result update( Category Category){
		try {
			this.CategoryService.update(Category);
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
				this.CategoryService.delete(Integer.parseInt(id));
			}
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	} 
	
}
