package com.onlineshop.pojo;

import java.io.Serializable;

public class PayWay implements Serializable {
	private int id;//付款id
	private String name; //付款方式名称
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PayWay{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
