package com.hospital.hospital.controller;

import com.hospital.hospital.domain.MedicineList;
import com.hospital.hospital.service.MedicineListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
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

    @RequestMapping("/delProfile")
    public String batchDeletes(HttpServletRequest request) {

        String[ ] idChecked = request.getParameterValues("idChecked"); //获取前端所选复选框的value
        int[] idArray = new int[idChecked.length];
//        for (int i = 0; i < idChecked.length; i++) {         //把或取到的String数组转换为int数组
//            idArray[i] = Integer.parseInt(idChecked[i]);
            medicineListService.deletemedicinelistcount(idChecked);
//        }
       return "dispensing";
    }

    }
