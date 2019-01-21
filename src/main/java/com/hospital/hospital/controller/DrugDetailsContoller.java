package com.hospital.hospital.controller;

import com.hospital.hospital.domain.DrugDetails;
import com.hospital.hospital.service.DrugDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/
@Controller
public class DrugDetailsContoller {

    @Autowired
    private DrugDetailsService drugDetailsService;

    @RequestMapping("findAllDrugDetails")
    @ResponseBody
    public List<DrugDetails> findAllDrugDetails(){
        return drugDetailsService.findAll();
    }

    @RequestMapping("insertDrugDetails")
    public String insert(DrugDetails drugDetails){
        System.out.println(drugDetails);
//        drugDetailsService.insertDrugDetails(drugDetails);
        return "/product-brand";

    }



}
