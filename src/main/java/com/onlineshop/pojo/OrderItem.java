package com.onlineshop.pojo;

import java.io.Serializable;

public class OrderItem implements Serializable {

	private int id;//订单详情id
	private MyOrder myOrder; //订单条目对应的订单id
	private Product product;//订单条目对应的商品id
	private int number; //商品数量
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MyOrder getMyOrder() {
		return myOrder;
	}
	public void setMyOrder(MyOrder myOrder) {
		this.myOrder = myOrder;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "OrderItem{" +
				"id=" + id +
				", myOrder=" + myOrder +
				", product=" + product +
				", number=" + number +
				'}';
	}
}
