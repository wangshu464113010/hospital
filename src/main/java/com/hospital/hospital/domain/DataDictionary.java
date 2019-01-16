package com.hospital.hospital.domain;


import java.io.Serializable;

public class DataDictionary implements Serializable {

  private String id;                //'主键'
  private String name;              //名称',
  private String parentId;          //父id，没有用-1代替',
  private java.util.Date createDate;//创建时间',
  private java.util.Date updateDate;//最近一次修改日期',
  private Long state;               //状态，0=停用，1=启用'


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


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public java.util.Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.util.Date createDate) {
    this.createDate = createDate;
  }


  public java.util.Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(java.util.Date updateDate) {
    this.updateDate = updateDate;
  }


  public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }

}
