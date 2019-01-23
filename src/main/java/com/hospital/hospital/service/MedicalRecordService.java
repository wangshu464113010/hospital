package com.hospital.hospital.service;

import com.hospital.hospital.domain.MedicalRecord;

import java.util.List;

public interface MedicalRecordService {
    void insertMedicalRecord(MedicalRecord medicalRecord);
    List<MedicalRecord> findall();
    void deleteById(String id);
    MedicalRecord  findbyId(String id);
    void updateMedicalRecordbyid(MedicalRecord medicalRecord);
    List<MedicalRecord> deletemedicinelistcount(String[] medicine_id);//批量删除
}
