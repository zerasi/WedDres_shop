package cn.sys.service;

import java.util.List;

import cn.sys.entity.User;
import cn.sys.entity.UserExample;
import cn.sys.utils.PageResult;

public interface UserService {

	List<User> findAll();

	void add(User user);

	void update(User user);

	User login(UserExample example);

	PageResult findPage(UserExample example, Integer page, Integer rows);

	User findOne(Integer id);

	void delete(int parseInt);

}
