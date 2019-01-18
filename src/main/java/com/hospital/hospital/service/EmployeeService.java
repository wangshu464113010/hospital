package com.hospital.hospital.service;/**
 * @author wangshu
 * @create 2019-01-18-9:21
 */

import com.hospital.hospital.domain.Employee;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/

public interface EmployeeService {

    public List<Employee> findAllByPage();



}
