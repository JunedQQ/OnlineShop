package com.onlineshop.dao;

import com.onlineshop.pojo.ShopCart;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
public interface ShopCartDao {

    /**
     * 根据用户id查询出来
     * @return
     */
    List<ShopCart> findShopCartByUserId();
}