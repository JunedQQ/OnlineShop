package com.onlineshop.pojo;

import java.io.Serializable;

public class ProductImage implements Serializable {
	private int id; //图片id
	private String url; //图片地址
	private Product product; //图片对应的商品
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
