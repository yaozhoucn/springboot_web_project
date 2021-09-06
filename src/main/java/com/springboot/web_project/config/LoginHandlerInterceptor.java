package com.springboot.web_project.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by WXHang on HANG at 2021/8/31 14:51
 * Desc：
 * @author HANG
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        System.out.println(loginUser);
        if (loginUser == null){
            //没有登陆
            request.setAttribute("msg","没有权限，请先登陆！");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else {
            return true;
        }
    }

}
