package com.springboot.web_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by WXHang on HANG at 2021/9/6 11:22
 * Desc：
 */
@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;


    //查询数据库的所有链接
    @RequestMapping("userlist")
    public List<Map<String,Object>> getUserList(){
        String sql = "select * from user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

    @RequestMapping("addUser")
    public String addUser(){
        String sql = "insert into user(id,name,pwd,perms) values (4,'test2',1234,2)";
        int update = jdbcTemplate.update(sql);

        return "add_success";
    }

    @RequestMapping("updateUser/{id}")
    public String updateUser(@PathVariable int id){
        String sql = "update springboot.user set user.name  = ? ,pwd = ? where id = "+id;
        Object[] objects = new Object[2];
        objects[0] = "test2";
        objects[1] = "psswewerewds";
        int update = jdbcTemplate.update(sql,objects);

        return "update_success";
    }

    @RequestMapping("delUser/{id}")
    public String delUser(@PathVariable("id") int id){
        String sql = "delete from user where id = ?";
        int update = jdbcTemplate.update(sql,id);

        return "del_success";
    }

}
