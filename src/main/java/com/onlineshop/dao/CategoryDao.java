package com.onlineshop.dao;

import com.onlineshop.pojo.CateGory;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/22
 * @since 1.0.0
 */
@Repository("categoryDao")
public interface CategoryDao {

    /**
     * 获取所有的类别
     * @return
     */
    List<CateGory> findAllCateGory();


    /**
     * 根据分类名获得分类id
     * @param categoryName
     * @return
     */
    int findCategoryIdByName(String categoryName);

}