package com.onlineshop.service.impl;

import com.onlineshop.dao.CategoryDao;
import com.onlineshop.pojo.CateGory;
import com.onlineshop.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/22
 * @since 1.0.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    @Qualifier("categoryDao")
    private CategoryDao categoryDao;

    @Override
    public List<CateGory> findAllCateGory() {
        return categoryDao.findAllCateGory();
    }
}