package com.onlineshop.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
public class OrderStatus implements Serializable {
    private int id; //订单状态id
    private String statusName; //订单状态名称
    private List<MyOrder> orders; //当前状态的订单

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

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}