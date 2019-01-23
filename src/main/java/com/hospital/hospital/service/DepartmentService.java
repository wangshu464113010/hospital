package com.hospital.hospital.service;

import com.hospital.hospital.domain.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> findFirstLevel();
}
