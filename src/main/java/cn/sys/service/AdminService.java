package cn.sys.service;


import cn.sys.entity.Admin;
import cn.sys.entity.AdminExample;

public interface AdminService {

	Admin login(Admin admin);

	void add(Admin admin);

	void update(Admin admin);

	Admin findOne(Integer id);

	void delete(int parseInt);

	cn.sys.utils.PageResult findPage(AdminExample example, Integer page, Integer rows);

}
