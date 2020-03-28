package cn.sys.controller;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.sys.entity.Cart;
import cn.sys.entity.Category;
import cn.sys.entity.CategoryExample;
import cn.sys.entity.Custorder;
import cn.sys.entity.CustorderExample;
import cn.sys.entity.Orderitem;
import cn.sys.entity.Product;
import cn.sys.entity.User;
import cn.sys.service.CartService;
import cn.sys.service.OrderService;
import cn.sys.utils.PageResult;
import cn.sys.utils.Result;

@RestController
@RequestMapping("custOrder")
public class CustOrderController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private OrderService oservice;
	
	@RequestMapping("subOrder")
	public Result subOrder(HttpServletRequest request,Custorder custorder){
		
		try {
			User user = (User) request.getSession().getAttribute("user");
			List<Cart> cartList = cartService.findCartListByRedis(user.getId()+"");
			List<Orderitem> orderList = new ArrayList<Orderitem>();
			BigDecimal allfee = new BigDecimal("0.00");
			for(Cart cart: cartList){
				orderList.addAll(cart.getOrderItemList());
				for(Orderitem orderitem : cart.getOrderItemList()){
					allfee = allfee.add(orderitem.getTotalfee());
				}
			}
			custorder.setPayment(allfee);
			custorder.setUid(user.getId());
			oservice.add(orderList,custorder);
			cartService.addCartListToRedis(user.getId()+"", null);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
		
	}
	
	@RequestMapping("myorder")
	public List<Custorder> myorder(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		if(user == null){
			return null;
		}
		try {
			List<Custorder> list = oservice.myorder(user);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("findPage")
	public PageResult findPage(Custorder custorder,Integer page,Integer rows){
		CustorderExample example = new CustorderExample();
		return this.oservice.findPage(example,page,rows);
	}
	
	@RequestMapping("pay")
	public Result pay(Integer id){
		try {
			this.oservice.pay(id);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("over")
	public Result over(Integer id){
		try {
			this.oservice.over(id);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("fahuo")
	public Result fahuo(Integer id){
		try {
			this.oservice.fahuo(id);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping(value="delete")
	public Result delete(String ids){
		
		try {
			for (String id : ids.split(",")) {
				this.oservice.delete(Integer.parseInt(id));
			}
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	} 
	

}
