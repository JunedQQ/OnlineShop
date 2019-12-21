package com.onlineshop.dao;

import com.onlineshop.pojo.Product;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 * 用户收藏持久层
 */
@Repository("collectDao")
public interface CollectDao {

    /**
     * 根据用户的id来获取用户的收藏商品
     * @param userId
     * @return
     */
    List<Product> findCollectProductByUserId(int userId);
}