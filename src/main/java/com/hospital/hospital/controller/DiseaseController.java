package com.hospital.hospital.controller;

import com.hospital.hospital.domain.Disease;
import com.hospital.hospital.service.DiseaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("disease")
public class DiseaseController {
    @Resource
    private DiseaseService diseaseService;

}
