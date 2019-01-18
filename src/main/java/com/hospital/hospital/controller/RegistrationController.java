package com.hospital.hospital.controller;

import com.hospital.hospital.domain.Page;
import com.hospital.hospital.domain.Registration;
import com.hospital.hospital.service.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: hospital
 * @description: 挂号信息表的控制类
 * @author: wuyun
 * @create: 2019-01-17
 **/
@Controller//   article-list.html
@RequestMapping("Registration")
public class RegistrationController {

    @Resource
    private RegistrationService registrationService;

    /**
     * 查找所有的挂号信息
     * @return 返回病人信息的json
     */
    @RequestMapping("Registration-findAll")
    @ResponseBody
    public List<Registration> findAll(){
        List<Registration> list = registrationService.findAll();
        return list;
    }



}
