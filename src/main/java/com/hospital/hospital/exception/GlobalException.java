package com.hospital.hospital.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: hospital
 * @description: 404跳转页面
 * @author: wangshu
 * @create: 2019-01-16
 **/
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = {java.lang.Exception.class})
    public String exceptionHandler(Exception e){
//        ModelAndView mv = new ModelAndView();
////        mv.setViewName("404");
        return "404";
    }


}
