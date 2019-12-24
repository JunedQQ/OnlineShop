package com.onlineshop.service;

import com.onlineshop.pojo.CateGory;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/22
 * @since 1.0.0
 */
public interface CategoryService {

    /**
     * 获取所有的类别
     * @return
     */
    List<CateGory> findAllCateGory();

}