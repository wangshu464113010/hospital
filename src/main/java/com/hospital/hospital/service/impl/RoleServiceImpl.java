package com.hospital.hospital.service.impl;/**
 * @author wangshu
 * @create 2019-01-22-11:23
 */

import com.hospital.hospital.domain.Role;
import com.hospital.hospital.mapper.RoleMapper;
import com.hospital.hospital.service.RoleServicce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-22
 **/
@Service
public class RoleServiceImpl implements RoleServicce {
    @Resource
    private RoleMapper roleMapper;
    @Override
    public void insert(Role role) {
        role.setId(UUID.randomUUID().toString());
        roleMapper.insert(role);
    }

    @Override
    public List<Role> findAll() {
        return roleMapper.selectByExample(null);
    }
}
