package com.hospital.hospital.controller;

import com.hospital.hospital.domain.Employee;
import com.hospital.hospital.exception.UserException;
import com.hospital.hospital.mapper.EmployeeMapper;
import com.hospital.hospital.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: hospital
 * @description: 跳转页面 and login
 * @author: wangshu
 * @create: 2019-01-16
 **/

@Controller
public class HelloController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/{page}")//跳转页面
    public String toPage(@PathVariable String page,HttpServletRequest request,Model model){
//        if("login".equals(page)||"login.html".equals(page)){
//            return "redirect:login";
//        }
        Object employee = request.getSession().getAttribute("employee");
        if(employee==null){ //检查session中是否含有employee对象
//            model.addAttribute("error","您还没有登录请登录");
            return "login";
        }else {
            return page;
        }
    }

    @RequestMapping("checkLogin")
    public String checkLogin(String username, String password, Model model, HttpServletRequest request){
//        System.out.println(request.getRequestURL());
        HttpSession session = request.getSession();

        Employee employee = null;
        //=========>前端验证
        if (username == null || "".equals(username) ||password == null || "".equals(password)){
            model.addAttribute("username",username);
            model.addAttribute("password",password);
            model.addAttribute("error","请填写用户名和密码");
            return "login";
        }
        try {
           employee = employeeService.Login(username, password);//验证用户名和密码
        } catch (UserException e) {
            e.printStackTrace();
            model.addAttribute("username",username);
            model.addAttribute("password",password);
            model.addAttribute("error","用户名或密码错误，请确认后，重新登录");
            return "login";
        }catch (Exception e){
            e.printStackTrace();
//            return "redirect:404.html";
        }
//        session.invalidate();//销毁session
        model.addAttribute("name",employee);
        session.setAttribute("employee",employee);

        return "index.html";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:login";
    }
    @RequestMapping("viewEmployee")
    @ResponseBody
    public Employee viewEmployee(HttpSession session){
        return (Employee) session.getAttribute("employee");
    }

    @RequestMapping("updateEmployee")
    public String updateEmployee(final Employee employee,final HttpSession session){
        employeeService.update(employee);
        Employee login = employeeService.findByPK(employee.getId());
        session.setAttribute("employee",login);//更新session中的信息,
        return "ok";
    }



//    @RequestMapping("/index")
//    public String toIndex(){
//        System.out.println("123456");
//        return "index";
//    }
//    @RequestMapping("/main")
//    public String toPage(){
//        System.out.println("123456");
//        return "main";
//    }

}