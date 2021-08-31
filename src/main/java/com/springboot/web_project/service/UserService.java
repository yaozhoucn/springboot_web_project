package com.springboot.web_project.service;

import com.springboot.web_project.pojo.Users;

/**
 * Created by WXHang on HANG at 2021/8/31 10:24
 * Desc：
 */
public interface UserService {
    Users queryUserByName(String username);
}
