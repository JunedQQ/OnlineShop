package com.onlineshop.controller;

import com.onlineshop.pojo.Product;
import com.onlineshop.service.ProductService;
import com.onlineshop.utils.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author JunedQQ
 * @create 2019/12/23
 * @since 1.0.0
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/getCategoryProduct")
    public ModelAndView getCategoryProduct(ModelAndView model, Page<Product> page, int categoryId, HttpServletRequest request) {
        //判断page对象是否为空
        if (page == null) {
            page = new Page<>();
            //默认设置当前页为1
            page.setCurrentPage(1);
            //默认设置每页显示20条数据
            page.setRows(20);
        }
        //设置默认每页显示条数
        if (page.getRows() == 0) {
            page.setRows(20);
        }
        //设置默认当前页面
        if (page.getCurrentPage() < 1) {
            page.setCurrentPage(1);
        }
        //获取session
        HttpSession session = request.getSession();
        Map<Integer, Page<Product>> categoryProductMap = (Map<Integer, Page<Product>>) session.getAttribute("categoryProduct");
        //判断session是否有categoryProduct数据
        if (categoryProductMap == null) {
            categoryProductMap = new HashMap<>();
        }
        //判断当前访问的分类map中是否存在
        if (!categoryProductMap.containsKey(categoryId) || categoryProductMap.get(categoryId).getCurrentPage() != page.getCurrentPage() ) {
            //分类不存在
            Page<Product> resultPage;
            if (categoryId == -1){
                 resultPage = productService.findAllProduct(page);
            }else {
                //查询分类商品
                 resultPage = productService.findProductByCategory(categoryId, page);
            }
            //如果总页数为0，则设置默认总页数
            if (page.getTotalPage() == 0){
                page.setTotalPage(1);
            }
            //创建存放分类商品的容器，key为分类id，list集合为商品
            categoryProductMap.put(categoryId, resultPage);
            //分类商品信息存放至session
            session.setAttribute("categoryProduct", categoryProductMap);
        }
        //存放当前是什么分类
        session.setAttribute("currentCateId", categoryId);
        //转发至页面
        model.setViewName("forward:/category");
        return model;
    }
}