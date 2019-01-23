package com.hospital.hospital.service.impl;

import com.hospital.hospital.domain.Department;
import com.hospital.hospital.mapper.DepartmentMapper;
import com.hospital.hospital.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findFirstLevel() {
        return departmentMapper.selectByExample(null);
    }
}
