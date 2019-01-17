package com.hospital.hospital;

import com.hospital.hospital.domain.Employee;
import com.hospital.hospital.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Random;
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

    @Test
    public void Testinsert1(){
        String[] name = new String[]{"红利","吴静","吴小莉","商鞅",
                "孔颖","吴晓生","李丽",
        "盛佳","董丽丽","里白"};
        for(int i=0;i<10;++i){
            Employee e = new Employee();
            e.setId(UUID.randomUUID().toString());
            e.setName(name[i]);
            e.setAge(20L);
            e.setAddress("深圳");
            e.setAllergy("无");
            e.setBeforeJob("医生");
            e.setBirthday(new Date());
            e.setBloodType("AB型");
            e.setDiploma("本科");
            e.setEmail("abcd"+name[i]+"@qq.com");
            e.setHeight(new Random().nextDouble()+1);
            e.setWeight(new Random().nextDouble()*10+70);
            e.setIdentityNum(new Random().nextInt(406445646)+""+ new Random().nextInt(406445646));
            e.setTel(new Random().nextInt(934595239)+"");
            e.setSal(5000.0);
            e.setState(1L);
            e.setSex("女");
            e.setSerialNum(new Random().nextInt(99999)+"");
            e.setPassword(new Random().nextInt(9999999)+"");
            e.setMarriage("未婚");
            employeeMapper.insert(e);
        }

    }
}
