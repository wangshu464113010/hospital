package com.hospital.hospital.domain;


import java.io.Serializable;

public class Employee implements Serializable {

  private String id;              // '主键'
  private String name;     // '姓名',
  private String serialNum; // '编号--规则：入职年+部门号+第几人',
  private String password;  // '密码',
  private String sex;   //'性别',
  private Long age;      //'年龄',
  private java.util.Date birthday;//'出生日期',
  private Double weight;   //'体重--单位：公斤',
  private Double height;    //'身高--单位：m',
  private String marriage;    //'婚姻状况--已婚/未婚',
  private String homePosition;    //'家庭职位',
  private String bloodType;  //'血型',
  private String address;  //'家庭住址',
  private String tel;             //'电话号码',
  private String identityNum;     //'身份证号码',
  private String allergy;         //'过敏史',
  private String diploma;         //'文凭',
  private String email;           //'唯一约束，邮箱',
  private Long state;             //'状态：0=离职，1=在职，2=休息，3=退休', ...
  private Double sal;             //'工资',
  private String beforeJob;       //'以前职业',


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


  public String getSerialNum() {
    return serialNum;
  }

  public void setSerialNum(String serialNum) {
    this.serialNum = serialNum;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }


  public java.util.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.util.Date birthday) {
    this.birthday = birthday;
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


  public String getMarriage() {
    return marriage;
  }

  public void setMarriage(String marriage) {
    this.marriage = marriage;
  }


  public String getHomePosition() {
    return homePosition;
  }

  public void setHomePosition(String homePosition) {
    this.homePosition = homePosition;
  }


  public String getBloodType() {
    return bloodType;
  }

  public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getIdentityNum() {
    return identityNum;
  }

  public void setIdentityNum(String identityNum) {
    this.identityNum = identityNum;
  }


  public String getAllergy() {
    return allergy;
  }

  public void setAllergy(String allergy) {
    this.allergy = allergy;
  }


  public String getDiploma() {
    return diploma;
  }

  public void setDiploma(String diploma) {
    this.diploma = diploma;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }


  public Double getSal() {
    return sal;
  }

  public void setSal(Double sal) {
    this.sal = sal;
  }


  public String getBeforeJob() {
    return beforeJob;
  }

  public void setBeforeJob(String beforeJob) {
    this.beforeJob = beforeJob;
  }

}
