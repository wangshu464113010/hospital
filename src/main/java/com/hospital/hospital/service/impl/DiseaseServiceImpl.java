package com.hospital.hospital.service.impl;


import com.hospital.hospital.domain.Disease;
import com.hospital.hospital.domain.DiseaseExample;
import com.hospital.hospital.mapper.DiseaseMapper;
import com.hospital.hospital.service.DiseaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: hospital
 * @description: 服疾病分类表
 * @author: wuyun
 * @create: 2019-01-16
 **/
@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Resource
    private DiseaseMapper diseaseMapper;

}
