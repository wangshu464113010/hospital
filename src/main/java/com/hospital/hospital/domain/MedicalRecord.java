package com.hospital.hospital.domain;


import java.io.Serializable;
import java.util.Date;

public class MedicalRecord implements Serializable {

  private String id;// '主键'
  private String allergy;//'过敏史',
  private String diagnosticType;//'诊断类型',
  private Long temperature;//'体温',
  private String symptom;//'症状',
  private String bloodPressure;//'血压,一段范围',
  private String diagnosticInfo;//'诊断信息',
  private String doctorAdvice;//'医嘱',
  private String breathing;//'呼吸',
  private String pulse;//'脉搏',
  private Double money;//'治疗费用',
  private java.util.Date consultationDate;//'就诊日期',
  private Long contagion;//'是否传染：1=是，2=否',
  private String medicalHistory;//'病史',
  private String employeeId;//'医生主键',
  private String employeeName;//'医生姓名',
  private Long diseaseId;//'疾病类别主键',
  private String departmentName;//'科室名',
  private String departmentId;//'科室主键',
  private String diseaseName;//'疾病类别名',
  private String patientName;//'病人主键',

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAllergy() {
    return allergy;
  }

  public void setAllergy(String allergy) {
    this.allergy = allergy;
  }

  public String getDiagnosticType() {
    return diagnosticType;
  }

  public void setDiagnosticType(String diagnosticType) {
    this.diagnosticType = diagnosticType;
  }

  public Long getTemperature() {
    return temperature;
  }

  public void setTemperature(Long temperature) {
    this.temperature = temperature;
  }

  public String getSymptom() {
    return symptom;
  }

  public void setSymptom(String symptom) {
    this.symptom = symptom;
  }

  public String getBloodPressure() {
    return bloodPressure;
  }

  public void setBloodPressure(String bloodPressure) {
    this.bloodPressure = bloodPressure;
  }

  public String getDiagnosticInfo() {
    return diagnosticInfo;
  }

  public void setDiagnosticInfo(String diagnosticInfo) {
    this.diagnosticInfo = diagnosticInfo;
  }

  public String getDoctorAdvice() {
    return doctorAdvice;
  }

  public void setDoctorAdvice(String doctorAdvice) {
    this.doctorAdvice = doctorAdvice;
  }

  public String getBreathing() {
    return breathing;
  }

  public void setBreathing(String breathing) {
    this.breathing = breathing;
  }

  public String getPulse() {
    return pulse;
  }

  public void setPulse(String pulse) {
    this.pulse = pulse;
  }

  public Double getMoney() {
    return money;
  }

  public void setMoney(Double money) {
    this.money = money;
  }

  public Date getConsultationDate() {
    return consultationDate;
  }

  public void setConsultationDate(Date consultationDate) {
    this.consultationDate = consultationDate;
  }

  public Long getContagion() {
    return contagion;
  }

  public void setContagion(Long contagion) {
    this.contagion = contagion;
  }

  public String getMedicalHistory() {
    return medicalHistory;
  }

  public void setMedicalHistory(String medicalHistory) {
    this.medicalHistory = medicalHistory;
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

  public Long getDiseaseId() {
    return diseaseId;
  }

  public void setDiseaseId(Long diseaseId) {
    this.diseaseId = diseaseId;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getDiseaseName() {
    return diseaseName;
  }

  public void setDiseaseName(String diseaseName) {
    this.diseaseName = diseaseName;
  }

  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  @Override
  public String toString() {
    return "MedicalRecord{" +
            "id='" + id + '\'' +
            ", allergy='" + allergy + '\'' +
            ", diagnosticType='" + diagnosticType + '\'' +
            ", temperature=" + temperature +
            ", symptom='" + symptom + '\'' +
            ", bloodPressure='" + bloodPressure + '\'' +
            ", diagnosticInfo='" + diagnosticInfo + '\'' +
            ", doctorAdvice='" + doctorAdvice + '\'' +
            ", breathing='" + breathing + '\'' +
            ", pulse='" + pulse + '\'' +
            ", money=" + money +
            ", consultationDate=" + consultationDate +
            ", contagion=" + contagion +
            ", medicalHistory='" + medicalHistory + '\'' +
            ", employeeId='" + employeeId + '\'' +
            ", employeeName='" + employeeName + '\'' +
            ", diseaseId=" + diseaseId +
            ", departmentName='" + departmentName + '\'' +
            ", departmentId='" + departmentId + '\'' +
            ", diseaseName='" + diseaseName + '\'' +
            ", patientName='" + patientName + '\'' +
            '}';
  }

  public MedicalRecord() {
  }

  public MedicalRecord(String id, String allergy, String diagnosticType, Long temperature, String symptom, String bloodPressure, String diagnosticInfo, String doctorAdvice, String breathing, String pulse, Double money, Date consultationDate, Long contagion, String medicalHistory, String employeeId, String employeeName, Long diseaseId, String departmentName, String departmentId, String diseaseName, String patientName) {
    this.id = id;
    this.allergy = allergy;
    this.diagnosticType = diagnosticType;
    this.temperature = temperature;
    this.symptom = symptom;
    this.bloodPressure = bloodPressure;
    this.diagnosticInfo = diagnosticInfo;
    this.doctorAdvice = doctorAdvice;
    this.breathing = breathing;
    this.pulse = pulse;
    this.money = money;
    this.consultationDate = consultationDate;
    this.contagion = contagion;
    this.medicalHistory = medicalHistory;
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.diseaseId = diseaseId;
    this.departmentName = departmentName;
    this.departmentId = departmentId;
    this.diseaseName = diseaseName;
    this.patientName = patientName;
  }
}
