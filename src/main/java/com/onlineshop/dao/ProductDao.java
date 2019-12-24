package com.onlineshop.dao;


import com.onlineshop.pojo.Product;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


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

    /**
     * 获取所有分类id为cateGory的商品
     * @param cateGoryId 分类id
     * @return
     */
    List<Product> findProductByCategory(@Param("cateGoryId") int cateGoryId, @Param("start") int start, @Param("rows") int rows);


    /**
     * 获取所有商品
     * @return
     */
    List<Product> findAllProduct(@Param("start") int start, @Param("rows") int rows);

    /**
     * 查询分类id为cateGoryId的总记录数
     * @param cateGoryId
     * @return
     */
    int findCategoryProductTotal(int cateGoryId);

    /**
     * 获取商品的总数
     * @return
     */
    int findAllProductTotal();
}