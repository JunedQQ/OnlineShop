package com.onlineshop.controller;

import com.onlineshop.pojo.User;
import com.onlineshop.pojo.UserInfo;
import com.onlineshop.service.UserService;
import com.onlineshop.utils.MD5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JunedQQ
 * @create 2019/12/22
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录验证
     *
     * @param loginUser 表单接收对象
     * @param request   请求体
     * @return
     */
    @RequestMapping("/login_verify")
    public Map<String, Object> login_verify(User loginUser, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        System.out.println("登录");
        if (loginUser == null) {
            map.put("type", "error");
            map.put("msg", "请输入用户名");
        } else if (StringUtils.isEmpty(loginUser.getUserName())) {
            map.put("type", "error");
            map.put("msg", "请输入用户名");
        } else if (StringUtils.isEmpty(loginUser.getPassword())) {
            map.put("type", "error");
            map.put("msg", "请输入密码");
        } else {
            User resultUser = userService.findUserByUserNameToLogin(loginUser.getUserName());
            if (resultUser == null || !resultUser.getPassword().equals(MD5.getMD5x100(loginUser.getPassword()))) {
                map.put("type", "error");
                map.put("msg", "用户名或密码错误");
            } else if (resultUser.getStatus() == 0) {
                map.put("type", "error");
                map.put("msg", "该用户已被冻结");
            } else {
                User user = userService.findUserByUserName(loginUser.getUserName());
                request.getSession().setAttribute("user", user);
                map.put("type", "success");
                map.put("msg", "登录成功");
            }
        }
        return map;
    }


    @RequestMapping("register_verify")
    public Map<String, Object> register_verify(User user, String captcha, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //获取系统生成的验证码
        String session_captcha = (String) request.getSession().getAttribute("captcha");
        if (user == null) {
            map.put("type", "error");
            map.put("msg", "请输入用户名");
        } else if (StringUtils.isEmpty(user.getUserName())) {
            map.put("type", "error");
            map.put("msg", "请输入用户名");
        } else if (StringUtils.isEmpty(user.getPassword())) {
            map.put("type", "error");
            map.put("msg", "请输入密码");
        } else if (StringUtils.isEmpty(captcha)) {
            map.put("type", "error");
            map.put("msg", "请输入验证码");
        } else if (StringUtils.isEmpty(session_captcha)) {
            map.put("type", "timeout");
            map.put("msg", "回话超时，请刷新网页");
        } else if (!session_captcha.equalsIgnoreCase(captcha)) {
            map.put("type", "captchaError");
            map.put("msg", "验证码错误，请重新输入");
        } else {
            if (!userService.judgeUserIsExist(user.getUserName())) {
                //创建用户信息对象
                UserInfo userInfo = new UserInfo();
                //设置用户昵称
                userInfo.setNickName(user.getUserName());
                //设置默认头像
                userInfo.setIcon("http://120.77.205.137/photo.jpg");
                //存放信息对象
                user.setUserInfo(userInfo);
                //密码进行加密
                user.setPassword(MD5.getMD5x100(user.getPassword()));
                //添加用户
               boolean result =  userService.addUser(user);
                if (result) {
                    map.put("type", "success");
                    map.put("msg", "用户注册成功，请前往登录");
                } else {
                    map.put("type", "error");
                    map.put("msg", "用户注册失败，请稍后重试");
                }
            } else {
                map.put("type", "error");
                map.put("msg", "用户名已存在,请重试");
            }

        }
        return map;
    }

}