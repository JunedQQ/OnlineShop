package com.onlineshop.pojo;

import java.io.Serializable;

public class UserInfo implements Serializable {

	private int id; //用户信息id
	private String icon; //用户头像
	private User user; //用户信息对应的user信息
	private String phone; //用户电话号码
	private String email; //用户邮箱
	private int gender; //用户性别
	private double balance; //用户余额
	private String nickName;//用户昵称
	private String payWayPassword; //付款密码

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPayWayPassword() {
		return payWayPassword;
	}

	public void setPayWayPassword(String payWayPassword) {
		this.payWayPassword = payWayPassword;
	}

	@Override
	public String toString() {
		return "UserInfo{" +
				"id=" + id +
				", icon='" + icon + '\'' +
				", user=" + user +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", gender=" + gender +
				", balance=" + balance +
				", nickName='" + nickName + '\'' +
				", payWayPassword='" + payWayPassword + '\'' +
				'}';
	}
}
