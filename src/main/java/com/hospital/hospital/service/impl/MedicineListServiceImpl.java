package com.hospital.hospital.service.impl;

import com.hospital.hospital.domain.MedicineList;
import com.hospital.hospital.mapper.MedicineListMapper;
import com.hospital.hospital.service.MedicineListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicineListServiceImpl implements MedicineListService {
    @Autowired
    private MedicineListMapper medicineListMapper;

    @Override
    public void addmedicine_list(MedicineList medicine_list) {
        this.medicineListMapper.insertmedicine_list(medicine_list);
    }

    @Override
    public List<MedicineList> selectfindallmedicinelist() {
        return this.medicineListMapper.selectfindallmedicinelist();
    }

    @Override
    public void deletemedicinelist(String medicine_id) {
        this.medicineListMapper.deletemedicinelist(medicine_id);
    }

    @Override
    public List<MedicineList> selectmedicinelistById(String medicine_id) {
        return this.medicineListMapper.selectmedicinelistById(medicine_id);
    }

    @Override
    public void updatemedicinelist(MedicineList medicine_list) {
        this.medicineListMapper.updatemedicinelist(medicine_list);
    }

    @Override
    public List<MedicineList> selectmedicine_listbylike(String name1) {
       return this.medicineListMapper.selectmedicine_listbylike(name1);

    }
}
