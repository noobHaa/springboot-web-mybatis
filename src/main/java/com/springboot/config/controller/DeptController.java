package com.springboot.config.controller;

import com.springboot.config.bean.Department;
import com.springboot.config.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot-web-mybatis
 * @Package: com.springboot.config.controller
 * @ClassName: DeptController
 * @Author: gnnt
 * @Date: 2019/1/25 16:52
 * @Version: 1.0
 */
@RestController
public class DeptController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }
}
