package com.hospital.hospital.service;

import com.hospital.hospital.domain.MedicineList;

import java.util.List;

public interface MedicineListService {
    void addmedicine_list(MedicineList medicineList);
    List<MedicineList> selectfindallmedicinelist();//查找所有拿药单号
    void deletemedicinelist(String medicine_id);//删除功能
    List<MedicineList> selectmedicinelistById(String medicine_id);//通过id回显修改的药品单号
    void updatemedicinelist(MedicineList medicine_list);//更新数据
    List<MedicineList> selectmedicine_listbylike( String name1);//模糊查找
    List<MedicineList> deletemedicinelistcount(String[] medicine_id);//批量删除
}
