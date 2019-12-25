package com.onlineshop.service;

import com.onlineshop.pojo.Product;
import com.onlineshop.utils.Page;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/23
 * @since 1.0.0
 */
public interface ProductService {

    /**
     * 根据商品id获取商品信息
     * @param productId 商品id
     * @return
     */
    Product findProductById(int productId);

    /**
     * 获取所有分类id为cateGory的商品
     * @param cateGoryId 分类id
     * @return
     */
    Page<Product> findProductByCategory(int cateGoryId, Page<Product> page);


    /**
     * 获取所有商品，分页
     * @param page
     * @return
     */
    Page<Product> findAllProduct(Page<Product> page);

    /**
     * 获取商品的总数
     * @return
     */
    int findAllProductTotal();


    /**
     * 模糊查询所有商品
     * @return
     */
    Page<Product> findProductIsFuzzy(String keyword,Page<Product> page);
}