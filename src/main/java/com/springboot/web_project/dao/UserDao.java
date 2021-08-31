package com.springboot.web_project.dao;

import com.springboot.web_project.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by WXHang on HANG at 2021/8/30 17:39
 * Desc：
 */
@Mapper
@Repository
public interface UserDao {
    Users queryUserByName(String username);
}
