package com.hospital.hospital.domain;


import java.io.Serializable;

public class Registration implements Serializable {

  private String id;                      //  主键'
  private Long serialNum;   //'编号',
  private String departmentId;  //'科室主键',
  private String departmentName;    //'科室名称',
  private String employeeId; //'医生主键',
  private String employeeName;   //'医生姓名',
  private String registrationId;    //'挂号员主键',
  private String registrationPerson;//'挂号员',
  private Long state;        //'该号的状态,1=就诊，2=已经就诊，3=退号',
  private Long moneyState;   //'收费状态，1=已收费，2=未交费',
  private Double money;    //'挂号费用',
  private Long category;     //'挂号类别：1=专家号，2=普通号',
  private String payWay;     //'支付方式',
  private java.util.Date registrationDate;//     '挂号日期',

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Long getSerialNum() {
    return serialNum;
  }

  public void setSerialNum(Long serialNum) {
    this.serialNum = serialNum;
  }


  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }


  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }


  public String getRegistrationPerson() {
    return registrationPerson;
  }

  public void setRegistrationPerson(String registrationPerson) {
    this.registrationPerson = registrationPerson;
  }


  public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }


  public Long getMoneyState() {
    return moneyState;
  }

  public void setMoneyState(Long moneyState) {
    this.moneyState = moneyState;
  }


  public Double getMoney() {
    return money;
  }

  public void setMoney(Double money) {
    this.money = money;
  }


  public Long getCategory() {
    return category;
  }

  public void setCategory(Long category) {
    this.category = category;
  }


  public String getPayWay() {
    return payWay;
  }

  public void setPayWay(String payWay) {
    this.payWay = payWay;
  }


  public java.util.Date getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(java.util.Date registrationDate) {
    this.registrationDate = registrationDate;
  }

}
