package com.springboot.web_project.service.ServiceImpl;

import com.springboot.web_project.dao.UserDao;
import com.springboot.web_project.pojo.Users;
import com.springboot.web_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WXHang on HANG at 2021/8/31 10:26
 * Desc：
 *
 * 组合dao层，调用到
 *
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Users queryUserByName(String username) {
        Users user = userDao.queryUserByName(username);
        return user;
    }
}
