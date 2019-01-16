package com.hospital.hospital.service.impl;

import com.hospital.hospital.domain.Patient;
import com.hospital.hospital.mapper.PatientMapper;
import com.hospital.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: hospital
 * @description:病人信息服务类
 * @author: wangshu
 * @create: 2019-01-16
 **/
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Override
    public List<Patient> findAll() {//查询所有病人信息
        return this.patientMapper.selectAll();
    }
}
