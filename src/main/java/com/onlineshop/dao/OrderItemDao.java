package com.onlineshop.dao;

import com.onlineshop.pojo.OrderItem;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/20
 * @since 1.0.0
 */
@Repository("orderItemDao")
public interface OrderItemDao {

    /**
     * 根据订单id查询数据
     * @param orderId 订单id
     * @return
     */
    List<OrderItem> findItemsByOrderId(int orderId);
}