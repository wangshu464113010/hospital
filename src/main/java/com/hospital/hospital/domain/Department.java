package com.hospital.hospital.domain;


import java.io.Serializable;

public class Department implements Serializable {

  private String id;        //'主键'
  private String name;      //'科室名',
  private Long diseaseId;   //'科室类别主键'
  private String category;  //'科室类别',
  private String personId;  //'负责人主键',
  private String personName;//'负责人姓名',


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


  public Long getDiseaseId() {
    return diseaseId;
  }

  public void setDiseaseId(Long diseaseId) {
    this.diseaseId = diseaseId;
  }


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }


  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

}
