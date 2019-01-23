package com.hospital.hospital.service.impl;

import com.hospital.hospital.domain.MedicalRecord;
import com.hospital.hospital.domain.MedicalRecordExample;
import com.hospital.hospital.mapper.MedicalRecordMapper;
import com.hospital.hospital.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordMapper medicalRecordMapper;
    @Override
    public void insertMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecordMapper.insert(medicalRecord);
    }

    @Override
    public List<MedicalRecord> findall() {
       return this.medicalRecordMapper.selectByExample(null);

    }

    @Override
    public void deleteById(String id) {
        this.medicalRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public MedicalRecord findbyId(String id) {
       return this.medicalRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateMedicalRecordbyid(MedicalRecord medicalRecord) {
        this.medicalRecordMapper.updateByPrimaryKey(medicalRecord);

    }

    @Override
    public List<MedicalRecord> deletemedicinelistcount(String[] medicine_id) {
        this.medicalRecordMapper.deletemdrcount(medicine_id);
        return null;
    }

}
