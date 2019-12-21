package com.onlineshop.dao;

import com.onlineshop.pojo.OrderStatus;

import org.springframework.stereotype.Repository;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
@Repository("orderStatusDao")
public interface OrderStatusDao {

    /**
     * 根据订单状态id来获取订单状态
     * @param id
     * @return
     */
    OrderStatus findOrderStatusById(int id);
}