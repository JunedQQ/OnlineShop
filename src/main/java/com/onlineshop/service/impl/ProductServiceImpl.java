package com.onlineshop.service.impl;

import com.onlineshop.dao.ProductDao;
import com.onlineshop.pojo.Product;
import com.onlineshop.service.ProductService;
import com.onlineshop.utils.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/23
 * @since 1.0.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    @Qualifier("productDao")
    private ProductDao productDao;

    @Override
    public Product findProductById(int productId) {
        return productDao.findProductById(productId);
    }


    @Override
    public Page<Product> findProductByCategory(int cateGoryId, Page<Product> page) {
        int total = productDao.findCategoryProductTotal(cateGoryId);
        int currentPage = page.getCurrentPage();
        int rows = page.getRows();
        int start = (currentPage - 1) * rows;
        int totalPage = total % rows == 0 ? total/rows:(total/rows)+1;
        List<Product> rowList = productDao.findProductByCategory(cateGoryId, start, rows);
        //设置数据
        page.setTotalCount(total);
        page.setTotalPage(totalPage);
        page.setRowsList(rowList);
        return page;
    }

    @Override
    public Page<Product> findAllProduct(Page<Product> page) {
        int total = productDao.findAllProductTotal();
        int currentPage = page.getCurrentPage();
        int rows = page.getRows();
        int start = (currentPage - 1) * rows;
        int totalPage = total % rows == 0 ? total/rows:(total/rows)+1;
        List<Product> rowList = productDao.findAllProduct( start, rows);
        //设置数据
        page.setTotalCount(total);
        page.setTotalPage(totalPage);
        page.setRowsList(rowList);
        return page;
    }

    @Override
    public int findAllProductTotal() {
        return productDao.findAllProductTotal();
    }
}