package com.hospital.hospital.service;


import com.hospital.hospital.domain.Registration;

import java.util.List;

/**
 * @program: hospital
 * @description: 病人信息服务接口
 * @author: wangshu
 * @create: 2019-01-16
 **/
public interface RegistrationService {

    public List<Registration> findAll();


}
