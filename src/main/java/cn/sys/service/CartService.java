package cn.sys.service;

import java.util.List;

import cn.sys.entity.Cart;

public interface CartService {
	
	public List<Cart> addGoodsToCartList(List<Cart> cartList, Integer pid, Integer num);
	
	public List<Cart> findCartListByRedis(String loginName);
	
	public void addCartListToRedis(String loginName, List<Cart> cartList);

}
