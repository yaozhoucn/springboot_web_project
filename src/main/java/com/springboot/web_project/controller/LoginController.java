package com.springboot.web_project.controller;

import com.alibaba.druid.util.StringUtils;
import com.springboot.web_project.pojo.Users;
import com.springboot.web_project.service.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by WXHang on HANG at 2021/8/30 17:13
 * Desc：
 */
@Controller
public class LoginController {
    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
       /* if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            return "dashboard";
        }else {
            model.addAttribute("msg","用户名或者密码错误");
            return "index";*/
       if (!StringUtils.isEmpty(username)) {
           Users user = userService.queryUserByName(username);
           if (user != null){
               if (user.getPwd().equals(password)){
                   session.setAttribute("loginUser",username);
                   return "dashboard";
               }else {
                   model.addAttribute("msg","用户名或者密码错误");
                   return "index";
               }

            }else {
                model.addAttribute("msg","用户名或者密码错误");
                return "index";
            }
       }else {
           model.addAttribute("msg","用户名或者密码错误");
           return "index";
       }

    }
}
