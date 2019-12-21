package com.onlineshop.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Product implements Serializable {
	private int id; //商品id
	private CateGory cateGory; //类别
	private String name; //商品名称
	private double price; //单价
	private int stock; //库存
	private int sell; //销量
	private String descript; //详情
	private int status; //状态，0下架，1上架
	private Date createTime; //创建时间
	private List<ProductImage> image; //商品图片
	private List<MyOrder> orders; //商品所属的订单
	
	public List<MyOrder> getOrders() {
		return orders;
	}
	public void setOrders(List<MyOrder> orders) {
		this.orders = orders;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CateGory getCateGory() {
		return cateGory;
	}
	public void setCateGory(CateGory cateGory) {
		this.cateGory = cateGory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getSell() {
		return sell;
	}
	public void setSell(int sell) {
		this.sell = sell;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public List<ProductImage> getImage() {
		return image;
	}
	public void setImage(List<ProductImage> image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", cateGory=" + cateGory +
				", name='" + name + '\'' +
				", price=" + price +
				", stock=" + stock +
				", sell=" + sell +
				", descript='" + descript + '\'' +
				", status=" + status +
				", createTime=" + createTime +
				", image=" + image +
				", orders=" + orders +
				'}';
	}
}
