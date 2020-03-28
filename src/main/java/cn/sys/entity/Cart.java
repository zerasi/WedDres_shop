package cn.sys.entity;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable{

	private String cid;
	
	private String cateName;
	
	private List<Orderitem> orderItemList;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public List<Orderitem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<Orderitem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	

	
}