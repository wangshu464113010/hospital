package com.hospital.hospital.controller;

import com.hospital.hospital.domain.Department;
import com.hospital.hospital.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("department")
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;

    @RequestMapping("findFirstLevel")
    @ResponseBody
    public List<Department> findFirstLevel(){
        return this.departmentService.findFirstLevel();
    }

}
