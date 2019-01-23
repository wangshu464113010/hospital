package com.hospital.hospital.controller;

import com.hospital.hospital.domain.DrugDetails;
import com.hospital.hospital.service.DrugDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
        drugDetailsService.insertDrugDetails(drugDetails);
        return "ok";

    }
    @RequestMapping("findByName/{name}")
    @ResponseBody
    public List<DrugDetails> findByName(@PathVariable String name){
        return drugDetailsService.findByName(name);
    }
    @RequestMapping("deleteById")
    @ResponseBody
    public String deleteById(String id){
        try {
            drugDetailsService.deleteById(id);
        }catch (Exception e){
            return "false";
        }
        return "success";
    }

    @RequestMapping("article-updat")
    public String update(String id, Model model){
        System.out.println("*****************************id = " + id);
        DrugDetails one = drugDetailsService.findOneByPk(id);
        model.addAttribute("one",one);
        return "article-update";
    }

    @RequestMapping("update-m")
    public String updateM(DrugDetails drugDetails) {

        drugDetailsService.update(drugDetails);

        return "ok";
    }


}
