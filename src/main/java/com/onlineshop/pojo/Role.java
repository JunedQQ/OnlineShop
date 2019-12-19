package com.onlineshop.pojo;

import java.io.Serializable;

public class Role implements Serializable {

	private int id; //角色id
	private String name; //角色名称
	private String remark; //角色描述
	
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	

}
