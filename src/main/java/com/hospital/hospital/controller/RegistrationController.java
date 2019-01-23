package com.hospital.hospital.controller;

import com.hospital.hospital.domain.Disease;
import com.hospital.hospital.domain.Registration;
import com.hospital.hospital.service.DataDictionaryService;
import com.hospital.hospital.service.DiseaseService;
import com.hospital.hospital.service.EmployeeService;
import com.hospital.hospital.service.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.security.sasl.SaslServer;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * @program: hospital
 * @description: 挂号信息表的控制类
 * @author: wuyun
 * @create: 2019-01-17
 **/
@Controller//   article-list.html
@RequestMapping("registration")
public class RegistrationController {

    @Resource
    private RegistrationService registrationService;

    /**
     * 查找所有的挂号信息
     * @return 返回病人信息的json
     */
    @RequestMapping("find")
    @ResponseBody
    public List<Registration> find(){
        List<Registration> registrationList = registrationService.find();
        return registrationList;
    }
    @RequestMapping("insertRegistration")
    public String insertRegistration(Registration registration) throws ParseException {
//        System.out.println("========================>\n"+registration);
        registrationService.insert(registration);
        return "ok";
    }
    @RequestMapping("updateRegistration")
    @ResponseBody
    public String updateRegistration(String id){
        registrationService.updateRegistration(id);
        return "";
    }
    @ResponseBody
    @RequestMapping("deleteRegistration")
    public String deleteRegistration(String id){
        registrationService.deleteRegistration(id);
        return "";
    }
    @ResponseBody
    @RequestMapping("selectRegistration")
    public List<Registration> findByLike(String category,String logmin,String logmax,String informationName){
        return registrationService.findByLike(category,logmin,logmax,informationName);
    }
    @ResponseBody
    @RequestMapping("deleteAllRegistration")
    public String deleteAllRegistration(String id){
        System.out.println("id = " + id);
        registrationService.deleteAllRegistration(id);
        return "";
    }



}
