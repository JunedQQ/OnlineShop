package com.onlineshop.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShopCart implements Serializable {

    private int id; //购物车id
    private Product products; //商品id
    private Integer number; //商品数量
    private Date addTime; //添加时间
    private User user; //购物车所属的用户

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public Integer getNumber() {
        return number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "ShopCart{" +
                "id=" + id +
                ", products=" + products +
                ", number=" + number +
                ", addTime=" + addTime +
                ", user=" + user +
                '}';
    }
}
