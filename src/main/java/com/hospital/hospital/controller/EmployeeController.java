package com.hospital.hospital.controller;

import com.hospital.hospital.domain.Employee;
import com.hospital.hospital.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;


    @RequestMapping("findDoctor")
    @ResponseBody
    public List<Employee> findDoctor(){
        return this.employeeService.findDoctor();
    }

    @RequestMapping("findEmployee")
    @ResponseBody
    public List<Employee> findEmployee(){
        return  this.employeeService.findEmployee();
    }




}
