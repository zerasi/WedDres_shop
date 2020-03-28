package cn.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.sys.dao.AdminMapper;
import cn.sys.entity.Admin;
import cn.sys.entity.AdminExample;
import cn.sys.service.AdminService;
import cn.sys.utils.PageResult;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminMapper mapper;

	
	public Admin login(Admin admin) {
		AdminExample example = new AdminExample();
		example.createCriteria().andUsernameEqualTo(admin.getUsername()).andPasswordEqualTo(admin.getPassword());
		List<Admin> adminList = this.mapper.selectByExample(example);
		if(adminList.size()<=0){
			return null;
		}
		return adminList.get(0);
	}

	
	public void add(Admin admin) {
		this.mapper.insert(admin);
		
	}

	
	public void update(Admin admin) {
		this.mapper.updateByPrimaryKeySelective(admin);
		
	}

	
	public PageResult findPage(AdminExample example, Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		Page<Admin> pages = (Page<Admin>) this.mapper.selectByExample(example);
		return new PageResult(pages.getTotal(), pages.getResult());
	}

	
	public Admin findOne(Integer id) {
		return this.mapper.selectByPrimaryKey(id);
	}

	
	public void delete(int parseInt) {
		this.mapper.deleteByPrimaryKey(parseInt);
		
	}

	

}
