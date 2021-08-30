package com.springboot.web_project.controller;

import com.alibaba.druid.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WXHang on HANG at 2021/8/30 17:13
 * Desc：
 */
@Controller
public class LoginController {
    @RequestMapping("user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            return "dashboard";
        }else {
            model.addAttribute("msg","用户名或者密码错误");
            return "index";
        }
    }
}
