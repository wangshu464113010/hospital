package com.hospital.hospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital.hospital.domain.Registration;
import com.hospital.hospital.domain.RegistrationExample;
import com.hospital.hospital.mapper.RegistrationMapper;
import com.hospital.hospital.service.RegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: hospital
 * @description:病人信息服务类
 * @author: wangshu
 * @create: 2019-01-16
 **/
@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Resource
    private RegistrationMapper registrationMapper;

    @Override
    public List<Registration> findAll() {//查询所有病人信息


//        RegistrationExample example = new RegistrationExample();
//        page.setTotal(registrationMapper.countByExample(null));
//        example.setOrderByClause(" asc limit "+((page.getFirstPage()-1)*page.getPageSize())+","+page.getPageSize());
//        RegistrationExample.Criteria criteria = example.createCriteria();
//
//        List<Registration> registrations = this.registrationMapper.selectByExample(example);
//        page.setList(registrations);

//        PageHelper.startPage(1, 2);
//        RegistrationExample example = new RegistrationExample();
//        List<Registration> list = registrationMapper.selectByExample(example);
//
//        PageInfo<Registration> pageInfo = new PageInfo<>(list);
//        System.out.println(list);
//
//        page.setTotal((int)pageInfo.getTotal());
  /*      PageHelper.startPage(currentpage,size);
// 直接查询
        List<ADeviceModelEntityVo> modelVoList = deviceModelMapper.getModelByManuCode(code);

        PageInfo<ADeviceModelEntityVo> result = new PageInfo<ADeviceModelEntityVo>(modelVoList);*/

        PageHelper.startPage(1, 2);
        List<Registration> userList = registrationMapper.selectByExample(null);
        System.out.println(userList);
        return userList;


    }
}
