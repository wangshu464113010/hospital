package com.hospital.hospital.controller;

import com.hospital.hospital.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: hospital
 * @description: 跳转页面
 * @author: wangshu
 * @create: 2019-01-16
 **/

@Controller
public class HelloController {

    @RequestMapping("/{page}")//跳转页面
    public String toPage(@PathVariable String page){
        return page;
    }

//    @RequestMapping("/index")
//    public String toIndex(){
//        System.out.println("123456");
//        return "index";
//    }
//    @RequestMapping("/main")
//    public String toPage(){
//        System.out.println("123456");
//        return "main";
//    }

}