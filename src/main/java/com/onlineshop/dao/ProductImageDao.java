package com.onlineshop.dao;

import com.onlineshop.pojo.ProductImage;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 * 商品图片持久层
 */
@Repository("productImageDao")
public interface ProductImageDao {

    /**
     * 根据商品id查找图片
     * @param productId
     * @return
     */
    List<ProductImage> findProductImageById(int productId);
}