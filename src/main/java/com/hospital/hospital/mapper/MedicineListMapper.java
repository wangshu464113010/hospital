package com.hospital.hospital.mapper;

import com.hospital.hospital.domain.MedicineList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicineListMapper {
     void insertmedicine_list(MedicineList medicine_list);
     List<MedicineList> selectfindallmedicinelist();
     void deletemedicinelist(String medicine_id);
     List<MedicineList> selectmedicinelistById(String medicine_id);
     void updatemedicinelist(MedicineList medicine_list);
     List<MedicineList> selectmedicine_listbylike(@Param("name1") String name);
     void deletemedicinelistcount(String medicine_id);
}
