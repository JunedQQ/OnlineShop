package com.onlineshop.dao;

import com.onlineshop.pojo.MyOrder;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
@Repository("myOrderDao")
public interface MyOrderDao {
    /**
     * 查询用户对应的所有订单
     * @param userId
     * @return
     */
    List<MyOrder> findOrdersByUserId(int userId);

    /**
     * 根据订单id获取订单
     * @param id 订单id
     * @return
     */
    MyOrder findOrderById(int id);
}