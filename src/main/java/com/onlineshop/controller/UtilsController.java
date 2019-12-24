package com.onlineshop.controller;

import com.onlineshop.utils.CaptChaUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author JunedQQ
 * @create 2019/12/23
 * @since 1.0.0
 */
@Controller
@RequestMapping("/utils")
public class UtilsController {

    @RequestMapping(path = "/get_captcha", method = RequestMethod.GET)
    public void getCaptcha(HttpServletRequest request,
                           HttpServletResponse response,
                           @RequestParam(name = "len", required = false, defaultValue = "4") Integer len,
                           @RequestParam(value = "w", required = false, defaultValue = "100") Integer w,
                           @RequestParam(value = "h", required = false, defaultValue = "30") Integer h,
                           @RequestParam(value = "type", required = false, defaultValue = "login") String type) {
        //创建验证码工具类
        CaptChaUtil captChaUtil = new CaptChaUtil(len, w, h);
        //获取工具类创建的验证码
        String captcha = captChaUtil.generatorVCode();
        //验证码存入session
        request.getSession().setAttribute("captcha", captcha);
        //生成图片
        BufferedImage image = captChaUtil.generatorRotateVCodeImage(captcha, true);
        //写出图片
        try {
            ImageIO.write(image, "jpg", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}