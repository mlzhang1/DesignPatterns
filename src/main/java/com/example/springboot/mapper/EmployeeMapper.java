package com.example.springboot.mapper;

import com.example.springboot.entity.EmployeePO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmployeeMapper {

    EmployeePO getEmpById(Integer id);

    void insertEmp(EmployeePO employee);
}
