package com.springboot.web_project.dao;

import org.apache.catalina.User;

/**
 * Created by WXHang on HANG at 2021/8/30 17:39
 * Desc：
 */
public interface UserDao {
    User login(String username, String password);
}
