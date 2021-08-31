package com.springboot.web_project;

import com.springboot.web_project.pojo.Users;
import com.springboot.web_project.service.ServiceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class WebProjectApplicationTests {
    @Autowired
    DataSource dataSource;

    @Autowired
    UserServiceImpl userService;


    @Test
    void contextLoads() throws SQLException {
        Users userByName = userService.queryUserByName("admin");
        System.out.println(userByName);
    }

}
