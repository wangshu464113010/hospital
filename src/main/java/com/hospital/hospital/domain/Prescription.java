package com.hospital.hospital.domain;


import java.io.Serializable;

public class Prescription implements Serializable {

  private String id;             // '主键'
  private String name;           //'处方名称',
  private String drugUsage;      //'用法',
  private String singleDose;     //'单次用量',
  private Long day;              //'天数',
  private String frequency;      //'频度',
  private String total;          //'总量',
  private Double money;          //'价格/单价',
  private String remark;         //'备注',
  private String medicalRecordId;//'病历主键',
  private String drugDetailsId;  //'药品主键',

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


  public String getDrugUsage() {
    return drugUsage;
  }

  public void setDrugUsage(String drugUsage) {
    this.drugUsage = drugUsage;
  }


  public String getSingleDose() {
    return singleDose;
  }

  public void setSingleDose(String singleDose) {
    this.singleDose = singleDose;
  }


  public Long getDay() {
    return day;
  }

  public void setDay(Long day) {
    this.day = day;
  }


  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }


  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }


  public Double getMoney() {
    return money;
  }

  public void setMoney(Double money) {
    this.money = money;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getMedicalRecordId() {
    return medicalRecordId;
  }

  public void setMedicalRecordId(String medicalRecordId) {
    this.medicalRecordId = medicalRecordId;
  }


  public String getDrugDetailsId() {
    return drugDetailsId;
  }

  public void setDrugDetailsId(String drugDetailsId) {
    this.drugDetailsId = drugDetailsId;
  }

}
