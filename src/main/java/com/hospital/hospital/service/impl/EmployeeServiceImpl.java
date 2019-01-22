package com.hospital.hospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital.hospital.domain.Employee;
import com.hospital.hospital.domain.EmployeeExample;
import com.hospital.hospital.exception.UserException;
import com.hospital.hospital.mapper.EmployeeMapper;
import com.hospital.hospital.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAllByPage() {
        //开始分页---参数1=第几页,参数2=每一页的大小
        PageHelper.startPage(2,3);
//        int i = employeeMapper.countByExample(null);
        List<Employee> list = employeeMapper.selectByExample(null);
        System.out.println(list.size());
        int i = employeeMapper.countByExample(null);
        PageInfo<Employee> pageInfo = new PageInfo<>(list);
        pageInfo.setSize(i);
        return list;
    }

    @Override
    public Employee Login(String SerialNum, String password) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andSerialNumEqualTo(SerialNum);
        criteria.andPasswordEqualTo(password);
        List<Employee> employees = employeeMapper.selectByExample(example);
        if (employees!=null && employees.size()!=0){
            return employees.get(0);
        }else{
            throw new UserException();
        }
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }

    @Override
    public Employee findByPK(String id) {
        return employeeMapper.selectByPrimaryKey(id);
    }
}
