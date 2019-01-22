package com.hospital.hospital.service.impl;

import com.hospital.hospital.domain.DrugDetails;
import com.hospital.hospital.domain.DrugDetailsExample;
import com.hospital.hospital.mapper.DrugDetailsMapper;
import com.hospital.hospital.service.DrugDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.dc.pr.PRError;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

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

    @Override
    public DrugDetails findOneByPk(String id) {
        return drugDetailsMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void insertDrugDetails(DrugDetails drugDetails) {
        String s = UUID.randomUUID().toString();
        drugDetails.setId(s);
        drugDetails.setSerialNum(s.replace("-","").substring(5,10));
        drugDetailsMapper.insert(drugDetails);
    }

    @Override
    public List<DrugDetails> findByName(String name) {
        name = '%'+name+'%';
        DrugDetailsExample example = new DrugDetailsExample();
        example.or().andAliasLike(name);
        example.or().andGenericNameLike(name);
        return drugDetailsMapper.selectByExample(example);
    }

    @Override
    public void deleteById(String id) {
        drugDetailsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(DrugDetails drugDetails) {
        drugDetailsMapper.updateByPrimaryKeySelective(drugDetails);
    }
}
