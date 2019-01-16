package com.hospital.hospital.domain;


import java.io.Serializable;

public class Disease implements Serializable {

  private Long id;         //nt '主键'
  private String serialNum;//科室编号',
  private String name;     //    类别',
  private Long parentId;   // 父id


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getSerialNum() {
    return serialNum;
  }

  public void setSerialNum(String serialNum) {
    this.serialNum = serialNum;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

}
