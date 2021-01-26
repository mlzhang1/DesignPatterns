package com.example.springboot.mapper;

import com.example.springboot.entity.DepartmentPO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id} ")
    DepartmentPO getDeptById(Integer id);

    @Delete("delete from department where id = #{id}")
    int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")  //获取自增主键
    @Insert("insert into department(name,count) value(#{name},#{count})")
    int insertDept(DepartmentPO department);

    @Update("update department set name=#{name},count=#{count} where id = #{id}")
    int updateDept(DepartmentPO department);
}
