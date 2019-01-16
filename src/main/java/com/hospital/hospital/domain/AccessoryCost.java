package com.hospital.hospital.domain;


import java.io.Serializable;

public class AccessoryCost implements Serializable {

  private String id;//'主键
  private String name;//'名称',  
  private Double money;//'金额',
  private String category;//'费用类型',
  private String medicalRecordId;//'病历主键',


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


  public Double getMoney() {
    return money;
  }

  public void setMoney(Double money) {
    this.money = money;
  }


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public String getMedicalRecordId() {
    return medicalRecordId;
  }

  public void setMedicalRecordId(String medicalRecordId) {
    this.medicalRecordId = medicalRecordId;
  }

}
