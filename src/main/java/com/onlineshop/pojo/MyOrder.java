package com.onlineshop.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MyOrder implements Serializable {

    private int id; //订单id
    private String orderNumber; //订单号
    private User user; //订单对应的用户信息
    private Address address; //订单对应的收货地址信息
    private double money; //订单总额
    private int number; //订单商品数量
    private OrderStatus status;//订单状态
    private PayWay payWay; //订单付款方式
    private String remark; //订单备注
    private Date createTime; //订单创建时间
    private Date completeTime; //订单确认收货时间
    private List<OrderItem> items; //订单中的商品

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public PayWay getPayWay() {
        return payWay;
    }

    public void setPayWay(PayWay payWay) {
        this.payWay = payWay;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", user=" + user +
                ", address=" + address +
                ", money=" + money +
                ", number=" + number +
                ", status=" + status +
                ", payWay=" + payWay +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", completeTime=" + completeTime +
                ", items=" + items +
                '}';
    }
}
