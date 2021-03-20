package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Employee;

/**
 * @author zhanghaotian
 * @create 2021-03-05 21:38
 * @lastEdit 2021-03-05 21:38
 */
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
