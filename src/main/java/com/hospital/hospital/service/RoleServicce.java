package com.hospital.hospital.service;/**
 * @author wangshu
 * @create 2019-01-22-11:23
 */

import com.hospital.hospital.domain.Role;

import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-22
 **/
public interface RoleServicce {

    public void insert(Role role);

    public List<Role> findAll();


}
