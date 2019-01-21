package com.hospital.hospital.service;/**
 * @author wangshu
 * @create 2019-01-21-9:14
 */

import com.hospital.hospital.domain.DataDictionary;

import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-21
 **/
public interface DataDictionaryService {

    public List<DataDictionary> findByPidEquals(String pid);

}
