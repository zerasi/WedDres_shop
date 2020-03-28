package cn.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.sys.dao.UserMapper;
import cn.sys.entity.User;
import cn.sys.entity.UserExample;
import cn.sys.service.UserService;
import cn.sys.utils.PageResult;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	
	public List<User> findAll() {
		return null;
	}

	
	public void add(User user) {
		this.userMapper.insertSelective(user);
		
	}

	
	public void update(User user) {
		this.userMapper.updateByPrimaryKeySelective(user);
		
	}

	
	public User login(UserExample example) {
		List<User> list = this.userMapper.selectByExample(example);
		if(list.size()==0){
			return null;
		}
		return list.get(0);
	}

	
	public PageResult findPage(UserExample example, Integer page, Integer rows) {
		PageHelper.startPage(page,rows);
		Page<User> pages = (Page<User>)this.userMapper.selectByExample(example);
		return new PageResult(pages.getTotal(), pages.getResult());
	}

	
	public User findOne(Integer id) {
		return this.userMapper.selectByPrimaryKey(id);
	}

	
	public void delete(int parseInt) {
		this.userMapper.deleteByPrimaryKey(parseInt);
		
	}

}
