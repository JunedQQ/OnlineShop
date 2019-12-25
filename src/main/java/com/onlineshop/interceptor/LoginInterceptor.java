package com.onlineshop.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.onlineshop.pojo.User;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author JunedQQ
 * @create 2019/12/24
 * @since 1.0.0
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        User user = (User)request.getSession().getAttribute("user");
        if (user == null){
            //获取请求头
            String header = request.getHeader("X-Requested-With");
            //判断是否是ajax请求
            if ("XMLHttpRequest".equals(header)){
                //表示是ajax请求
                Map<String,Object> result = new HashMap<>();
                result.put("type","error");
                result.put("msg","登录会话超时或还未登录，请重新登录");
                //转化为json数据
                ObjectMapper mapper = new ObjectMapper();
                String json = mapper.writeValueAsString(result);
                response.getWriter().write(json);
                return false;
            }
            //表示是普通请求，重定向
            response.sendRedirect(request.getContextPath() + "/login");
            return  false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}