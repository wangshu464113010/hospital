package com.hospital.hospital;

import com.hospital.hospital.domain.Employee;
import com.hospital.hospital.mapper.EmployeeMapper;
import com.hospital.hospital.service.RegistrationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-16
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEmployee {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private RegistrationService registrationService;
    @Test
    public void Testinsert1(){
        registrationService.findAll();
    }

    @Test
    public void Testinsert(){
        Employee e = new Employee();
        e.setId(UUID.randomUUID().toString());
        e.setName("李峰");
        e.setAge(20L);
        e.setAddress("湖南长沙");
        e.setAllergy("");
        e.setBeforeJob("程序员");
        e.setBirthday(new Date());
        e.setBloodType("A型");
        e.setDiploma("");
        e.setEmail("a@qq.com");
        e.setHeight(1.68);
        e.setWeight(60.0);
        e.setIdentityNum("4064215646564564x");
        e.setTel("1375695236");
        e.setSal(1000.0);
        e.setState(1L);
        e.setSex("男");
        e.setSerialNum("");
        e.setPassword("123456");
        e.setMarriage("未婚");
        employeeMapper.insert(e);
    }
}
