package com.onlineshop.controller;

import com.onlineshop.pojo.Product;
import com.onlineshop.service.ProductService;
import com.onlineshop.utils.Page;
import com.onlineshop.utils.ProductUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
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
    public ModelAndView getCategoryProduct(ModelAndView model,
                                           @RequestParam(required = false,defaultValue = "1") int currentPage,
                                           @RequestParam(required = false,defaultValue = "20") int rows,
                                           @RequestParam(required = false,defaultValue = "-1") int categoryId,
                                           HttpServletRequest request) {
        Page<Product> page = new Page<>();
        page.setRows(rows);
        page.setCurrentPage(currentPage);
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


    @RequestMapping("/product_details")
    public ModelAndView productDetails(ModelAndView model,int productId,HttpServletRequest request){
        //获取商品相关信息
        Product product = productService.findProductById(productId);
        //处理详情信息
        String desc = product.getDescript();
        List<String> list = ProductUtil.productDescManage(desc);
        //把商品信息存放至request中
        request.setAttribute("productDesc",product);
        request.setAttribute("descList",list);
        model.setViewName("forward:/introduction");
        return model;
    }

    @RequestMapping("/search_product")
    public ModelAndView searchProduct(String keyword,
                                      @RequestParam(required = false,defaultValue = "1") int currentPage,
                                      @RequestParam(required = false,defaultValue = "20") int rows,
                                      HttpServletRequest request,ModelAndView modelAndView){
        //设置分页信息
        Page<Product> page = new Page<>();
        page.setRows(rows);
        page.setCurrentPage(currentPage);
        //设置默认当前页面
        if (page.getCurrentPage() < 1) {
            page.setCurrentPage(1);
        }
        //获取商品信息
        Page<Product> searchProduct = productService.findProductIsFuzzy(keyword, page);
        //如果总页数为0，则设置默认总页数
        if (page.getTotalPage() == 0){
            page.setTotalPage(1);
        }
        //把信息存入request中
        request.setAttribute("searchProduct",searchProduct);
        request.setAttribute("keyword",keyword);
        //转发
        modelAndView.setViewName("forward:/search");
        return modelAndView;
    }



}