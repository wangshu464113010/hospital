package com.hospital.hospital.controller;

import com.hospital.hospital.domain.MedicalRecord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-17
 **/
@Controller
@RequestMapping("medicalRecord")
public class MedicalRecordController {
    @RequestMapping("add")
    public String add(MedicalRecord medicalRecord){
        System.out.println(medicalRecord);
        return null;
    }


}
