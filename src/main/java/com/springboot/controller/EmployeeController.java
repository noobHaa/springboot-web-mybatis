package com.springboot.controller;

import com.springboot.bean.Department;
import com.springboot.bean.Employee;
import com.springboot.mapper.DepartmentMapper;
import com.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot-web-mybatis
 * @Package: com.springboot.controller
 * @ClassName: DeptController
 * @Author: gnnt
 * @Date: 2019/1/25 16:52
 * @Version: 1.0
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    public Employee getDepartment(@PathVariable Integer id) {
        return employeeMapper.getEmployeeById(id);
    }

}
