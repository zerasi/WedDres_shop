package cn.sys.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.sys.dao.CategoryMapper;
import cn.sys.dao.ProductMapper;
import cn.sys.entity.Cart;
import cn.sys.entity.Orderitem;
import cn.sys.entity.Product;
import cn.sys.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	private ProductMapper pmMapper;
	
	@Autowired
	private CategoryMapper cmapper;
	
	
	public List<Cart> addGoodsToCartList(List<Cart> cartList, Integer pId, Integer num) {

		//1、根据productid获取类别ID
		Product product = pmMapper.selectByPrimaryKey(pId);
		product.setCategory(this.cmapper.selectByPrimaryKey(product.getCid()));
		String cId = product.getCid()+"";
		//2、判断此商品ID是否在cartList购物车集合中
		Cart cart = isCidToCartList(cartList,cId);
		if(cart == null){
			//4.1商品ID不存在CartList中，创建新的Cart对象
			cart = new Cart();
			cart.setCid(product.getCid().toString());
			cart.setCateName(product.getCategory().getName());
			List<Orderitem> orderItemList = new ArrayList<Orderitem>();
			Orderitem orderItem = this.createOrderItem(product, num);
			orderItemList.add(orderItem);
			cart.setOrderItemList(orderItemList);
			cartList.add(cart);
		} else{
			//2.1、分类的ID如果在CartList中，获取购物车OrderItemList购物车明细列表，遍历
			Orderitem orderItem = this.isItemToOrderItemList(cart.getOrderItemList(), pId);
			//2.2判断此pId添加的商品的ID是否在orderItemList中,
			if(orderItem == null){
				//3.1如果不存在，添加一个orderItem商品明细
				orderItem = createOrderItem(product, num);
				cart.getOrderItemList().add(orderItem);
			} else{
				//3.2如果存在，添加此orderItem商品明细的数量和总价格
				orderItem.setCount(orderItem.getCount()+num);
				orderItem.setTotalfee(product.getShop_price().multiply(new BigDecimal(orderItem.getCount())));
			}
			//数量一直减、明细中都没有此商品的，那么就把此商品从明细列表中删除
			if(orderItem.getCount() <= 0){
				cart.getOrderItemList().remove(orderItem);
			}
			//购物车的明细列表中一直减，一直减到没有明细，那么就把此购物车中对象给删除了
			if(cart.getOrderItemList().size() <= 0){
				cartList.remove(cart);
			}
		}

		return cartList;
	}
	
	
	//1、专门判断此商品ID是否在购物车集合中存在
	public Cart isCidToCartList(List<Cart> cartList, String cid){
		for (Cart cart : cartList) {
			if(cart.getCid().equals(cid)){
				return cart;
			}
		}
		return null;
	}
	
	//2、把商品表数据复制到OrderItem对象中类
	public Orderitem createOrderItem(Product product, Integer count){
		Orderitem orderItem = new Orderitem();
		orderItem.setPid(product.getId());
		orderItem.setCount(count);
		orderItem.setImg(product.getImg());
		orderItem.setPrice(product.getShop_price());
		orderItem.setCid(product.getCid());
		orderItem.setTitle(product.getName());
		orderItem.setTotalfee(product.getShop_price().multiply(new BigDecimal(count)));
		return orderItem;
	}
	
	//3、判断购物车明细列表中是否存在添加的商品ID
	public Orderitem isItemToOrderItemList(List<Orderitem> orderItemList, Integer pId){
		for (Orderitem orderItem : orderItemList) {
			if(orderItem.getPid().longValue() == pId.longValue()){
				return orderItem;
			}
		}
		return null;
	}
	
	/*@Autowired(required = false)
	public void setRedisTemplate(RedisTemplate redisTemplate) {
	    RedisSerializer stringSerializer = new StringRedisSerializer();
	    JdkSerializationRedisSerializer jdkSerializationRedisSerializer = new JdkSerializationRedisSerializer();
	    redisTemplate.setKeySerializer(stringSerializer);
	    redisTemplate.setValueSerializer(jdkSerializationRedisSerializer);
	    redisTemplate.setHashKeySerializer(stringSerializer);
	    redisTemplate.setHashValueSerializer(jdkSerializationRedisSerializer);
	    this.redisTemplate = redisTemplate;
	}*/
	
	@Autowired(required = false)
    public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate) {
        stringRedisTemplate.setHashValueSerializer(new Jackson2JsonRedisSerializer<Cart>(Cart.class));
        this.redisTemplate = stringRedisTemplate;
    }


	
	public List<Cart> findCartListByRedis(String loginName) {
		@SuppressWarnings("unchecked")
		String str = (String)redisTemplate.boundHashOps("cartList").get(loginName);
		List<Cart> cartList =  JSON.parseArray(str,Cart.class);
		if(cartList == null){
			cartList = new ArrayList<Cart>();
		}
		return cartList;
	}


	
	public void addCartListToRedis(String loginName, List<Cart> cartList) {
		String str = JSON.toJSONString(cartList);
		redisTemplate.boundHashOps("cartList").put(loginName, str);
		
	}
	

}
