package com.hospital.hospital.service;


import com.hospital.hospital.domain.Registration;

import java.text.ParseException;
import java.util.List;

/**
 * @program: hospital
 * @description: 病人信息服务接口
 * @author: wuyun
 * @create: 2019-01-16
 **/
public interface RegistrationService {

    public List<Registration> find();

    public void insert(Registration registration) throws ParseException;

    public void updateRegistration(String id);

    public void deleteRegistration(String id);

    public List<Registration> findByLike(String category,String logmin,String logmax,String informationName);

    public void deleteAllRegistration(String id);
}
