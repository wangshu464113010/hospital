package com.hospital.hospital.domain;


import java.io.Serializable;

public class DrugDetails implements Serializable {

  private String id;                    //     '主键'　　　　　　　
  private String serialNum;             //     '药品编号',
  private String genericName;           //    '药品通用名/名称',
  private String alias;                 //     '别名',
  private String freightYardCode;       //     '货位码',
  private String barCode;               //     '条形码',
  private String category;              //     '药品类别/分类',
  private String dosageForm;            //     '药品剂型',
  private String invoiceType;           //     '发票类型',
  private String medicationType;        //     '用药类型,处方药/非处方',
  private String approvalNumber;        //     '批准文号',
  private String factory;               //     '生产厂家',
  private String remark;                //     '备注',
  private Long nationalEssentialDrugs;  //     '是否为国家基本药物',
  private String drugUsage;             //     '用法',
  private String singleDose;            //     '单次用量',
  private Long day;                     //     '天数',
  private String frequency;             //     '频度',
  private String total;                 //     '总量',
  private String drugExplain;           //     '药品说明',
  private String effect;                //     '功效',
  private String sideEffects;           //     '不良反应',
  private String applicableDisease;     //     '使用症',
  private java.util.Date productionDate;//    '出厂日期期',
  private Long validityPeriod;          //     '有效期限',
  private Double price;                 //     '价格',
  private String other;                 //     '其他'

  @Override
  public String toString() {
    return "DrugDetails{" +
            "id='" + id + '\'' +
            ", serialNum='" + serialNum + '\'' +
            ", genericName='" + genericName + '\'' +
            ", alias='" + alias + '\'' +
            ", freightYardCode='" + freightYardCode + '\'' +
            ", barCode='" + barCode + '\'' +
            ", category='" + category + '\'' +
            ", dosageForm='" + dosageForm + '\'' +
            ", invoiceType='" + invoiceType + '\'' +
            ", medicationType='" + medicationType + '\'' +
            ", approvalNumber='" + approvalNumber + '\'' +
            ", factory='" + factory + '\'' +
            ", remark='" + remark + '\'' +
            ", nationalEssentialDrugs=" + nationalEssentialDrugs +
            ", drugUsage='" + drugUsage + '\'' +
            ", singleDose='" + singleDose + '\'' +
            ", day=" + day +
            ", frequency='" + frequency + '\'' +
            ", total='" + total + '\'' +
            ", drugExplain='" + drugExplain + '\'' +
            ", effect='" + effect + '\'' +
            ", sideEffects='" + sideEffects + '\'' +
            ", applicableDisease='" + applicableDisease + '\'' +
            ", productionDate=" + productionDate +
            ", validityPeriod=" + validityPeriod +
            ", price=" + price +
            ", other='" + other + '\'' +
            '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getSerialNum() {
    return serialNum;
  }

  public void setSerialNum(String serialNum) {
    this.serialNum = serialNum;
  }


  public String getGenericName() {
    return genericName;
  }

  public void setGenericName(String genericName) {
    this.genericName = genericName;
  }


  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  public String getFreightYardCode() {
    return freightYardCode;
  }

  public void setFreightYardCode(String freightYardCode) {
    this.freightYardCode = freightYardCode;
  }


  public String getBarCode() {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public String getDosageForm() {
    return dosageForm;
  }

  public void setDosageForm(String dosageForm) {
    this.dosageForm = dosageForm;
  }


  public String getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(String invoiceType) {
    this.invoiceType = invoiceType;
  }


  public String getMedicationType() {
    return medicationType;
  }

  public void setMedicationType(String medicationType) {
    this.medicationType = medicationType;
  }


  public String getApprovalNumber() {
    return approvalNumber;
  }

  public void setApprovalNumber(String approvalNumber) {
    this.approvalNumber = approvalNumber;
  }


  public String getFactory() {
    return factory;
  }

  public void setFactory(String factory) {
    this.factory = factory;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public Long getNationalEssentialDrugs() {
    return nationalEssentialDrugs;
  }

  public void setNationalEssentialDrugs(Long nationalEssentialDrugs) {
    this.nationalEssentialDrugs = nationalEssentialDrugs;
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


  public String getDrugExplain() {
    return drugExplain;
  }

  public void setDrugExplain(String drugExplain) {
    this.drugExplain = drugExplain;
  }


  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }


  public String getSideEffects() {
    return sideEffects;
  }

  public void setSideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
  }


  public String getApplicableDisease() {
    return applicableDisease;
  }

  public void setApplicableDisease(String applicableDisease) {
    this.applicableDisease = applicableDisease;
  }


  public java.util.Date getProductionDate() {
    return productionDate;
  }

  public void setProductionDate(java.sql.Date productionDate) {
    this.productionDate = productionDate;
  }


  public Long getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(Long validityPeriod) {
    this.validityPeriod = validityPeriod;
  }


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

}
