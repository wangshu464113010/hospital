package com.hospital.hospital.controller;

import com.hospital.hospital.domain.Patient;
import com.hospital.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: hospital
 * @description: 病人信息表的控制类
 * @author: wangshu
 * @create: 2019-01-16
 **/
@Controller
@RequestMapping("patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    /**
     * 查找所有的病人信息
     * @return 返回病人信息的json
     */
    @RequestMapping("findAll")
    @ResponseBody
    public List<Patient> findAll(){
        List<Patient> list = patientService.findAll();
        return list;
    }



}
