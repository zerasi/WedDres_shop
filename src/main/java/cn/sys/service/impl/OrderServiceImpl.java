package cn.sys.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.sys.dao.CustorderMapper;
import cn.sys.dao.OrderitemMapper;
import cn.sys.entity.Custorder;
import cn.sys.entity.CustorderExample;
import cn.sys.entity.Orderitem;
import cn.sys.entity.OrderitemExample;
import cn.sys.entity.User;
import cn.sys.service.OrderService;
import cn.sys.utils.PageResult;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private CustorderMapper custMapper;
	
	@Autowired
	private OrderitemMapper omapper;

	
	public void add(List<Orderitem> orderList, Custorder custorder) {
		custorder.setStatus("0");
		custorder.setCreate_time(new Date());
		custMapper.insert(custorder);
		for(Orderitem orderitem : orderList){
			orderitem.setOrderid(custorder.getId());
			omapper.insert(orderitem);
		}
	}

	
	public List<Custorder> myorder(User user) {
		CustorderExample example = new CustorderExample();
		example.createCriteria().andUidEqualTo(user.getId());
		List<Custorder> list = custMapper.selectByExample(example);
		for(Custorder custorder : list){
			OrderitemExample orderitemExample = new OrderitemExample();
			orderitemExample.createCriteria().andOrderidEqualTo(custorder.getId());
			List<Orderitem> itemList = this.omapper.selectByExample(orderitemExample);
			custorder.setOrderitems(itemList);
		}
		return list;
	}

	
	public void pay(Integer id) {
		Custorder custorder = this.custMapper.selectByPrimaryKey(id);
		custorder.setStatus("1");
		this.custMapper.updateByPrimaryKeySelective(custorder);
		
	}
	
	
	public void over(Integer id) {
		Custorder custorder = this.custMapper.selectByPrimaryKey(id);
		custorder.setStatus("3");
		this.custMapper.updateByPrimaryKeySelective(custorder);
		
	}

	
	public PageResult findPage(CustorderExample example, Integer page, Integer rows) {
		PageHelper.startPage(page,rows);
		Page<Custorder> pages = (Page<Custorder>) this.custMapper.selectByExample(example);
		return new PageResult(pages.getTotal(), pages.getResult());
	}

	
	public void fahuo(Integer id) {
		Custorder custorder = this.custMapper.selectByPrimaryKey(id);
		custorder.setStatus("2");
		this.custMapper.updateByPrimaryKeySelective(custorder);
		
	}

	
	public void delete(int parseInt) {
		this.custMapper.deleteByPrimaryKey(parseInt);
		
	}

}
