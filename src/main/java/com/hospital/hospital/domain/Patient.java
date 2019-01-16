package com.hospital.hospital.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: hospital
 * @description: 病人信息表
 * @author: wangshu
 * @create: 2019-01-16
 **/

public class Patient implements Serializable {

    private String id ;         //主键uuid
    private String name ;       //姓名
    private String sex ;
    private Integer age ;
    private Date birthday ;    //出生日期
    private Double weight ;
    private Double height ;
    private Date illnessDate ;//发病日期
    private String tel ;
    private String address ;     //地址
    private String identityNum ; //身份证号码
    private String relPerson ;   //关系人姓名
    private String relPersonTel ;//关系人电话

    public Patient() {
    }

    public String toString() {//测试使用
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", illnessDate='" + illnessDate + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", identityNum='" + identityNum + '\'' +
                ", relPerson='" + relPerson + '\'' +
                ", relPersonTel='" + relPersonTel + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getIllnessDate() {
        return illnessDate;
    }

    public void setIllnessDate(Date illnessDate) {
        this.illnessDate = illnessDate;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    public String getRelPerson() {
        return relPerson;
    }

    public void setRelPerson(String relPerson) {
        this.relPerson = relPerson;
    }

    public String getRelPersonTel() {
        return relPersonTel;
    }

    public void setRelPersonTel(String relPersonTel) {
        this.relPersonTel = relPersonTel;
    }
}
