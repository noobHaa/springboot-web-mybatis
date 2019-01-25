package com.springboot.config.bean;

/**
 * @ProjectName: springboot-web-mybatis
 * @Package: com.springboot.config.bean
 * @ClassName: Department
 * @Author: gnnt
 * @Date: 2019/1/25 16:52
 * @Version: 1.0
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
