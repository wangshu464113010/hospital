package com.hospital.hospital;

import com.hospital.hospital.domain.*;
import com.hospital.hospital.mapper.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalApplicationTests {

    @Resource
    private PatientMapper patientMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private DiseaseMapper diseaseMapper;
    @Resource
    private EmployeeMapper employeeMapper;
//    @Resource
//    private HRolesMapper hRolesMapper;
    @Resource
    private MedicalRecordMapper medicalRecordMapper;
    @Resource
    private RegistrationMapper registrationMapper;

    @Test
    public void contextLoads() {//环境搭建----测试mybatis
        List<Patient> list = patientMapper.selectAll();
        System.out.println(list);
    }



}

