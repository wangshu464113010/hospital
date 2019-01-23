package com.hospital.hospital.service.impl;

import com.hospital.hospital.domain.Registration;
import com.hospital.hospital.domain.RegistrationExample;
import com.hospital.hospital.mapper.DataDictionaryMapper;
import com.hospital.hospital.mapper.RegistrationMapper;
import com.hospital.hospital.service.RegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @program: hospital
 * @description:挂号信息服务类
 * @author: wuyun
 * @create: 2019-01-16
 **/
@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Resource
    private RegistrationMapper registrationMapper;
    @Resource
    private DataDictionaryMapper dataDictionaryMapper;

    @Override
    public List<Registration> find() {//查询所有病人信息
//        PageHelper.startPage(1, 2);
        List<Registration> list = registrationMapper.selectByExample(null);
        for (Registration registrationList:list
             ) {
            Integer category = registrationList.getCategory();
            registrationList.setDataDictionaryCategory(dataDictionaryMapper.selectByPrimaryKey(category.toString()));
            Integer moneyState =registrationList.getMoneyState();
            registrationList.setDataDictionaryMoneyState(dataDictionaryMapper.selectByPrimaryKey(moneyState.toString()));

        }
//        System.out.println(userList);
//        UUID.randomUUID().toString();//UUID
        return list;

    }

    @Override
    public void insert(Registration registration) throws ParseException{
        registration.setId(UUID.randomUUID().toString());
        RegistrationExample example = new RegistrationExample();
        RegistrationExample.Criteria criteria = example.createCriteria();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        registration.setRegistrationDate(new Date());
        criteria.andRegistrationDateEqualTo(sdf.parse(format));
        int count = registrationMapper.countByExample(example);
        registration.setSerialNum(count+1);
        registration.setState(1);
        registration.setMoneyState(800102);

        registrationMapper.insert(registration);
    }

    @Override
    public void updateRegistration(String id) {
//        RegistrationExample example = new RegistrationExample();
//        RegistrationExample.Criteria criteria= example.createCriteria();
//        802==801
        Registration registration = new Registration();
        registration.setId(id);
        registration.setMoneyState(800101);
        registrationMapper.updateByPrimaryKeySelective(registration);//可选择的更新

    }

    @Override
    public void deleteRegistration(String id) {
        registrationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Registration> findByLike(String category, String logmin, String logmax, String informationName) {
        List<Registration> list =new ArrayList<Registration>();
        RegistrationExample example = new RegistrationExample();
        RegistrationExample.Criteria criteria = example.createCriteria();
        RegistrationExample.Criteria criteria1 = example.createCriteria();
        RegistrationExample.Criteria criteria2 = example.createCriteria();

        if(!"null".equals(category)){
            criteria.andCategoryEqualTo(Integer.parseInt(category));
            criteria1.andCategoryEqualTo(Integer.parseInt(category));
            criteria2.andCategoryEqualTo(Integer.parseInt(category));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");


        if (logmin!=null&&logmin!=""&&logmax!=null&&logmax!=""&&logmax!=logmin){
            try {
                Date logminDate =  simpleDateFormat.parse(logmin);
                Date logmaxDate =  simpleDateFormat.parse(logmax);
                System.out.println("--------------------------------------------------------------");
                System.out.println("logmaxDate = " + logmaxDate);
                criteria.andRegistrationDateBetween(logminDate,logmaxDate);
                criteria1.andRegistrationDateBetween(logminDate,logmaxDate);
                criteria2.andRegistrationDateBetween(logminDate,logmaxDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else if (logmin!=null&&logmin!=""){
            try {
                Date logminDate = simpleDateFormat.parse(logmin);
                criteria.andRegistrationDateEqualTo(logminDate);
                criteria1.andRegistrationDateEqualTo(logminDate);
                criteria2.andRegistrationDateEqualTo(logminDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else if (logmax!=null&&logmax!=""){
            try {
                Date logmaxDate =  simpleDateFormat.parse(logmax);
                criteria.andRegistrationDateEqualTo(logmaxDate);
                criteria1.andRegistrationDateEqualTo(logmaxDate);
                criteria2.andRegistrationDateEqualTo(logmaxDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (informationName!=null&&!"".equals(informationName)){
            criteria.andDepartmentNameLike('%'+informationName+'%');
            criteria1.andEmployeenameLike('%'+informationName+'%');
            criteria2.andRegistrationPersonLike('%'+informationName+'%');
        }
        example.or(criteria);
        example.or(criteria1);
        example.or(criteria2);
        list = registrationMapper.selectByExample(example);
        for (Registration registrationList:list
        ) {
            Integer category1 = registrationList.getCategory();
            registrationList.setDataDictionaryCategory(dataDictionaryMapper.selectByPrimaryKey(category1.toString()));
            Integer moneyState =registrationList.getMoneyState();
            registrationList.setDataDictionaryMoneyState(dataDictionaryMapper.selectByPrimaryKey(moneyState.toString()));

        }
        System.out.println("-------------------------------"+list);
        return list;
    }

    @Override
    public void deleteAllRegistration(String id) {
        String[] sourceStrArray = id.split(",");
        for (int i = 0; i < sourceStrArray.length; i++) {
            System.out.println(sourceStrArray[i]);
            System.out.println("---------------------------------------------------" +
                    "----------------------------------------------------------------");
            registrationMapper.deleteByPrimaryKey(sourceStrArray[i]);
        }

    }


}
