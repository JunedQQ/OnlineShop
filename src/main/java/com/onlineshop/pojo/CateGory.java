package com.onlineshop.pojo;

import java.io.Serializable;

public class CateGory implements Serializable {

	private int id; //类别id
	private String name; //类别名称
	
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
		return "CateGory{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
