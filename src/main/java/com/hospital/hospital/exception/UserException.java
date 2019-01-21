package com.hospital.hospital.exception;

/**
 * @program: hospital
 * @description: 用户异常......
 * @author: wangshu
 * @create: 2019-01-16
 **/

public class UserException extends RuntimeException{
    @Override
    public void printStackTrace() {
//        super.printStackTrace();
        System.out.println(UserException.class.getName()+" : 用户名和密码匹配错误，请检查用户名和密码");
    }
}
