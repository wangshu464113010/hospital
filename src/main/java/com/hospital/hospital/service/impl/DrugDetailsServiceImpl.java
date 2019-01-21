package com.hospital.hospital.service.impl;

import com.hospital.hospital.domain.DrugDetails;
import com.hospital.hospital.mapper.DrugDetailsMapper;
import com.hospital.hospital.service.DrugDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import sun.dc.pr.PRError;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/
@Service
public class DrugDetailsServiceImpl implements DrugDetailsService {

    @Resource
    private DrugDetailsMapper drugDetailsMapper;


    @Override
    public List<DrugDetails> findAll() {
        return  drugDetailsMapper.selectByExample(null);
    }
}
