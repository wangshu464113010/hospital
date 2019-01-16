package com.hospital.hospital.service;

import com.hospital.hospital.domain.Patient;

import java.util.List;

/**
 * @program: hospital
 * @description: 病人信息服务接口
 * @author: wangshu
 * @create: 2019-01-16
 **/
public interface PatientService {

    public List<Patient> findAll();


}
