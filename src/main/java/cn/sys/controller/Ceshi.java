package cn.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.sys.dao.CategoryMapper;
import cn.sys.dao.UserMapper;
import cn.sys.entity.Category;
import cn.sys.entity.CategoryExample;
import cn.sys.entity.User;

@RestController
public class Ceshi {
	
	@Autowired
	private UserMapper mapper;
	
	@RequestMapping("ceshi")
	public User ceshi(HttpServletRequest request){
		User user = mapper.selectByPrimaryKey(1);
		request.getSession().setAttribute("user", user);
		return user;
	}

}
