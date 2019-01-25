package com.springboot.mapper;

import com.springboot.bean.Employee;

/**
 * @ProjectName: springboot-web-mybatis
 * @Package: com.springboot.mapper
 * @ClassName: EmployeeMapper
 * @Author: gnnt
 * @Date: 2019/1/25 17:38
 * @Version: 1.0
 */
public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);

    public int insertEmp(Employee employee);

}
