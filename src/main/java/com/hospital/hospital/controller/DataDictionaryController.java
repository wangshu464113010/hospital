package com.hospital.hospital.controller;

import com.hospital.hospital.domain.DataDictionary;
import com.hospital.hospital.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-21
 **/
@Controller
public class DataDictionaryController {

    @Autowired
    private DataDictionaryService dataDictionaryService;

    @ResponseBody
    @RequestMapping("dataDictionary/{pid}")
    public List<DataDictionary> findAllBypid(@PathVariable String pid){
        return dataDictionaryService.findByPidEquals(pid);
    }


}
