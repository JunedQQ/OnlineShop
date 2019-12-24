package com.onlineshop.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {

	private int id; //用户id
	private String userName; //用户名
	private String password; //用户密码
	private int status; //用户状态0为停用，1正常
	private Role role; //用户对应的角色
	private UserInfo userInfo; //用户信息
	private List<Address> address; //用户收货地址
	private List<Product> collect; //用户收藏
	private List<ShopCart> shopCart; //用户购物车
	private List<MyOrder> orders; //用户的所有订单
	private Date createTime; //用户创建时间
	
	public List<Product> getCollect() {
		return collect;
	}
	
	public void setCollect(List<Product> collect) {
		this.collect = collect;
	}
	
	public List<ShopCart> getShopCart() {
		return shopCart;
	}
	
	public void setShopCart(List<ShopCart> shopCart) {
		this.shopCart = shopCart;
	}
	
	public List<MyOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<MyOrder> orders) {
		this.orders = orders;
	}

	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}

}
