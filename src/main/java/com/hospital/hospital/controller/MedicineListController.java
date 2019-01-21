package com.hospital.hospital.controller;

import com.hospital.hospital.domain.MedicineList;
import com.hospital.hospital.service.MedicineListService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("/medicine")
public class MedicineListController {
    @Autowired
    private MedicineListService medicineListService;

    @ResponseBody
    @RequestMapping("/add_drugNu")
    public String addMedicine_list(MedicineList medicineList){
        this.medicineListService.addmedicine_list(medicineList);
        return "ok";
    }

   @RequestMapping("/findAllMedicineList")
    public String findAllMedicineList(Model model,String name1){
       if (name1==""){
            List<MedicineList> list = this.medicineListService.selectfindallmedicinelist();
            model.addAttribute("MedicineList",list);
        }else {
           List<MedicineList> list = this.medicineListService.selectmedicine_listbylike(name1);
            model.addAttribute("MedicineList",list);
        }
       return "dispensing";
    }
    @RequestMapping("/deleteMedicineListById")
    public String deleteMedList(String medicine_id){
        this.medicineListService.deletemedicinelist(medicine_id);
        return "dispensing";
    }
    @RequestMapping("/selectMedicineListById")
    public String selectmedicinelistNum(Model model,String medicine_id){
        List<MedicineList> list = this.medicineListService.selectmedicinelistById(medicine_id);
        model.addAttribute("m2",list.get(0));
        return "drug-update";
    }
   @RequestMapping("/updateMedical")
   public String upmedicinelistById(MedicineList medicineList){
        this.medicineListService.updatemedicinelist(medicineList);
       return "dispensing";
   }
    /*@RequestMapping("/selectAllmedicine_listbylike")
    public String selectMedicinelistlike(String name, Model model){
        List<MedicineList>list=this.medicineListService.selectmedicine_listbylike(name);
        model.addAttribute("model",list);
        return "dispensing";
    }*/
}
