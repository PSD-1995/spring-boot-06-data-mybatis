package com.atguigu.springboot.bean;

/**
 * @author zhanghaotian
 * @create 2021-03-05 20:59
 * @lastEdit 2021-03-05 20:59
 */
public class Department {
    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
