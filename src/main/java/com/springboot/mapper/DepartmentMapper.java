package com.springboot.mapper;

import com.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @ProjectName: springboot-web-mybatis
 * @Package: com.springboot.mapper
 * @ClassName: DepartmentMapper
 * @Author: gnnt
 * @Date: 2019/1/25 17:03
 * @Version: 1.0
 */
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
