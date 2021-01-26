package com.example.springboot.controller;

import com.example.springboot.entity.DepartmentPO;
import com.example.springboot.entity.EmployeePO;
import com.example.springboot.mapper.DepartmentMapper;
import com.example.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public DepartmentPO getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public DepartmentPO insertDept(DepartmentPO department){
        int i = departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public EmployeePO getEmpById(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }
}
