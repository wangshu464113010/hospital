package com.hospital.hospital.controller;

import com.hospital.hospital.domain.Role;
import com.hospital.hospital.service.RoleServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-22
 **/
@Controller
public class RoleController {
    @Autowired
    private RoleServicce roleServicce;

    @RequestMapping("insertRole")
    public String isnertRole(Role role){
        roleServicce.insert(role);
        return "ok";
    }
    @RequestMapping("findAllRole")
    @ResponseBody
    public List<Role> findAll(){
        return roleServicce.findAll();
    }


}
