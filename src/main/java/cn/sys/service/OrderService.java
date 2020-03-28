package cn.sys.service;

import java.util.List;

import cn.sys.entity.Custorder;
import cn.sys.entity.CustorderExample;
import cn.sys.entity.Orderitem;
import cn.sys.entity.User;
import cn.sys.utils.PageResult;

public interface OrderService {

	void add(List<Orderitem> orderList, Custorder custorder);

	List<Custorder> myorder(User user);

	void pay(Integer id);

	void over(Integer id);

	PageResult findPage(CustorderExample example, Integer page, Integer rows);

	void fahuo(Integer id);

	void delete(int parseInt);

}
