package com.hospital.hospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital.hospital.domain.Employee;
import com.hospital.hospital.mapper.EmployeeMapper;
import com.hospital.hospital.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAllByPage() {
        //开始分页---参数1=第几页,参数2=每一页的大小
        PageHelper.startPage(0,3);
//        int i = employeeMapper.countByExample(null);
        List<Employee> list = employeeMapper.selectByExample(null);
        System.out.println(list.size());
//        PageInfo<Employee> pageInfo = new PageInfo<>(list);
//        pageInfo.setSize(i);


        return list;
    }
}
