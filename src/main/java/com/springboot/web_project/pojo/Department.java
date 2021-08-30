package com.springboot.web_project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by WXHang on HANG at 2021/8/30 10:46
 * Desc：
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    //部门
    private Integer id;
    private String departmentName;
}
