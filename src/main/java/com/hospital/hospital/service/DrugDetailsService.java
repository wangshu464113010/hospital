package com.hospital.hospital.service;/**
 * @author wangshu
 * @create 2019-01-18-14:21
 */

import com.hospital.hospital.domain.DrugDetails;

import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/
public interface DrugDetailsService {

    public List<DrugDetails> findAll();

    public DrugDetails findOneByPk(String id);

    public void insertDrugDetails(DrugDetails drugDetails);

    public List<DrugDetails> findByName(String name);
    public void deleteById(String id);

    public void update(DrugDetails drugDetails);

}
