package com.hospital.hospital.controller;

import com.hospital.hospital.domain.MedicalRecord;
import com.hospital.hospital.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-17
 **/
@Controller
public class MedicalRecordController {
    @Autowired
    private MedicalRecordService medicalRecordService;

    @RequestMapping("addprescription")
    public String add(MedicalRecord medicalRecord){
        this.medicalRecordService.insertMedicalRecord(medicalRecord);
        return "ok";
    }
    @RequestMapping("findAllMedicalRecord")
    public String findallbyid(Model model,String name){
        if (name==null||name==""){
            List<MedicalRecord> list=this.medicalRecordService.findall();
            model.addAttribute("MedicalRecord",list);
        }else{
            MedicalRecord medicalRecord=this.medicalRecordService.findbyId(name);
            model.addAttribute("MedicalRecord",medicalRecord);
       }

        return "fee-dispensing";
    }
    @RequestMapping("/deleteMedicalRecordByid")
    public String deletebyId(String id){
        this.medicalRecordService.deleteById(id);
        return "fee-dispensing";
    }
    @RequestMapping("/findMedicalRecordByid")
    public String findoneById(Model model,String id){
        MedicalRecord medicalRecord=this.medicalRecordService.findbyId(id);
        model.addAttribute("MRD",medicalRecord);
        return "medical-record-update";
    }
    @RequestMapping("updateMedicalRecord")
    public String updatebyId(MedicalRecord medicalRecord){
        this.medicalRecordService.updateMedicalRecordbyid(medicalRecord);
        return "fee-dispensing";
    }
    @RequestMapping("/detProfile")
    public String batchDeletes(HttpServletRequest request) {
        String[ ] idChecked = request.getParameterValues("idChecked"); //获取前端所选复选框的value
        medicalRecordService.deletemedicinelistcount(idChecked);
        return "dispensing";
    }

}
