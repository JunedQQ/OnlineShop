package com.onlineshop.dao;


import com.onlineshop.pojo.Product;

import org.springframework.stereotype.Repository;


/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
@Repository("productDao")
public interface ProductDao {

    /**
     * 根据商品id获取商品信息
     * @param productId 商品id
     * @return
     */
    Product findProductById(int productId);
}