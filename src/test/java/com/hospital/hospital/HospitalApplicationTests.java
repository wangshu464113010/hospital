package com.hospital.hospital;

import com.hospital.hospital.domain.Patient;
import com.hospital.hospital.mapper.PatientMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalApplicationTests {

    @Autowired
    private PatientMapper patientMapper;

    @Test
    public void contextLoads() {//环境搭建----测试mybatis
        List<Patient> list = patientMapper.selectAll();
        System.out.println(list);


    }

}

