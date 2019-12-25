package com.onlineshop.controller;

import com.onlineshop.constant.ViewPage;
import com.onlineshop.pojo.CateGory;
import com.onlineshop.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JunedQQ
 * @create 2019/12/22
 * @since 1.0.0
 */
@Controller
public class ViewController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/home")
    public ModelAndView home(ModelAndView modelAndView, HttpServletRequest request){
        List<CateGory> cateGorys = categoryService.findAllCateGory();
        modelAndView.addObject("category",cateGorys);
        request.getSession().setAttribute("category",cateGorys);
        modelAndView.setViewName(ViewPage.HOME);
        return modelAndView;
    }

    @RequestMapping("/address")
    public ModelAndView address(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.ADDRESS);
        return modelAndView;
    }

    @RequestMapping("/collection")
    public ModelAndView collection(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.COLLECTION);
        return modelAndView;
    }

    @RequestMapping("/user_message")
    public ModelAndView information(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.USER_MESSAGE);
        return modelAndView;
    }

    @RequestMapping("/introduction")
    public ModelAndView introduction(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.INTRODUCTION);
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.LOGIN);
        return modelAndView;
    }

    @RequestMapping("/order")
    public ModelAndView order(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.ORDER);
        return modelAndView;
    }

    @RequestMapping("/order_info")
    public ModelAndView order_info(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.ORDER_INFO);
        return modelAndView;
    }

    @RequestMapping("/password")
    public ModelAndView password(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.PASSWORD);
        return modelAndView;
    }


    @RequestMapping("/pay")
    public ModelAndView pay(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.PAY);
        return modelAndView;
    }

    @RequestMapping("/personal_center")
    public ModelAndView personal_center(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.PERSONAL_CENTER);
        return modelAndView;
    }

    @RequestMapping("/register")
    public ModelAndView register(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.REGISTER);
        return modelAndView;
    }

    @RequestMapping("/search")
    public ModelAndView search(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.SEARCH);
        return modelAndView;
    }

    @RequestMapping("/shopcart")
    public ModelAndView shop_cart(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.SHOPCART);
        return modelAndView;
    }

    @RequestMapping("/category")
    public ModelAndView sort(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.CATEGORY);
        return modelAndView;
    }

    @RequestMapping("/success")
    public ModelAndView success(ModelAndView modelAndView){
        modelAndView.setViewName(ViewPage.SUCCESS);
        return modelAndView;
    }

    @RequestMapping("/404")
    public ModelAndView error404(ModelAndView model){
        model.setViewName(ViewPage.ERROR_404);
        return model;
    }

    @RequestMapping("/500")
    public ModelAndView error500(ModelAndView model){
        model.setViewName(ViewPage.ERROR_500);
        return model;
    }

}