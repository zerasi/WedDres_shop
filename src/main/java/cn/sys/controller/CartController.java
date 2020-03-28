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
import cn.sys.entity.Orderitem;
import cn.sys.entity.Product;
import cn.sys.entity.User;
import cn.sys.service.CartService;
import cn.sys.utils.Result;

@RestController
@RequestMapping("cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("findCart")
	public Map<String,Object> findCart(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			return null;
		}
		List<Cart> cartList = cartService.findCartListByRedis(user.getId()+"");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("cartList", cartList);
		Integer totalCount=0;
		BigDecimal allfee = new BigDecimal("0.00");
		for(Cart cart: cartList){
			for(Orderitem orderitem : cart.getOrderItemList()){
				totalCount = totalCount + orderitem.getCount();
				allfee = allfee.add(orderitem.getTotalfee());
			}
		}
		map.put("totalCount", totalCount);
		map.put("allfee", allfee);
		
		return map;
	}
	
	@RequestMapping("orderConfirm")
	public Map<String,Object> orderConfirm(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			return null;
		}
		List<Cart> cartList = cartService.findCartListByRedis(user.getId()+"");
		Map<String,Object> map = new HashMap<String,Object>();
		List<Orderitem> orderList = new ArrayList<Orderitem>();
		Integer totalCount=0;
		BigDecimal allfee = new BigDecimal("0.00");
		for(Cart cart: cartList){
			for(Orderitem orderitem : cart.getOrderItemList()){
				orderList.add(orderitem);
				totalCount = totalCount + orderitem.getCount();
				allfee = allfee.add(orderitem.getTotalfee()) ;
			}
		}
		map.put("orderList", orderList);
		map.put("totalCount", totalCount);
		map.put("allfee", allfee);
		
		return map;
	}
	
	@RequestMapping("addCart")
	public Result addCart(HttpServletRequest request,Integer pId,Integer count){
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			return null;
		}
		try {
			List<Cart> cartList = cartService.findCartListByRedis(user.getId()+"");
			cartList = cartService.addGoodsToCartList(cartList, pId, count);
			cartService.addCartListToRedis(user.getId()+"", cartList);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("delCart")
	public Result delCart(HttpServletRequest request,Integer pId,Integer count){
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			return null;
		}
		try {
			List<Cart> cartList = cartService.findCartListByRedis(user.getId()+"");
			cartList = cartService.addGoodsToCartList(cartList, pId, -count);
			cartService.addCartListToRedis(user.getId()+"", cartList);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("addCount")
	public Result addCount(HttpServletRequest request,Integer pId,Integer count){
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			return null;
		}
		try {
			List<Cart> cartList = cartService.findCartListByRedis(user.getId()+"");
			cartList = cartService.addGoodsToCartList(cartList, pId, -1);
			cartService.addCartListToRedis(user.getId()+"", cartList);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("subCount")
	public Result subCount(HttpServletRequest request,Integer pId,Integer count){
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			return null;
		}
		try {
			List<Cart> cartList = cartService.findCartListByRedis(user.getId()+"");
			cartList = cartService.addGoodsToCartList(cartList, pId, 1);
			cartService.addCartListToRedis(user.getId()+"", cartList);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}

}
