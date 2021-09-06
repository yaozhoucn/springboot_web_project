package com.springboot.web_project;

import com.springboot.web_project.service.ServiceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class WebProjectApplicationTests {
    @Autowired
    DataSource dataSource;

    @Autowired
    UserServiceImpl userService;


    @Test
    void contextLoads() throws SQLException {
     /*   Users userByName = userService.queryUserByName("admin");
        System.out.println(userByName);*/
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();

        System.out.println("========"+connection);
        String sql = "select * from springboot.user";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        Map<String,Object> maps = new HashMap<>();
        while (resultSet.next()){
            maps.put(resultSet.getString(2),resultSet.getString(3));
            System.out.println(maps);
        }
        connection.close();
    }

}
