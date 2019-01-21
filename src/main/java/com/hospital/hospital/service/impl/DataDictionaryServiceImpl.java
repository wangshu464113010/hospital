package com.hospital.hospital.service.impl;/**
 * @author wangshu
 * @create 2019-01-21-9:15
 */

import com.hospital.hospital.domain.DataDictionary;
import com.hospital.hospital.domain.DataDictionaryExample;
import com.hospital.hospital.mapper.DataDictionaryMapper;
import com.hospital.hospital.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-21
 **/
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {

    @Resource
    private DataDictionaryMapper dataDictionaryMapper;

    /**
     * 根据parentid查找DataDictionary
     * @param pid
     * @return
     */
    @Override
    public List<DataDictionary> findByPidEquals(String pid) {
        DataDictionaryExample example = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(pid);
        return dataDictionaryMapper.selectByExample(example);
    }
}
