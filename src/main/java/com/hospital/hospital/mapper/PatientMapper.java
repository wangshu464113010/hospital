package com.hospital.hospital.mapper;

import com.hospital.hospital.domain.Patient;

import java.util.List;

/**
 * @program: hospital
 * @description: 病人信息接口
 * @author: wangshu
 * @create: 2019-01-16
 **/
public interface PatientMapper {

    public List<Patient> selectAll();

    public void insert(Patient patient);
}
