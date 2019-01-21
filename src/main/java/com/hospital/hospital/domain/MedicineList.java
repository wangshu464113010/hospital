package com.hospital.hospital.domain;

public class MedicineList {
    private String medicine_id;
    private String prescription_id;
    private String mian_doctor;
    private String drug_id;
    private String drug_name;
    private String patientname;
    private Double Total_cost;
    private String time;

    public MedicineList() {
    }

    @Override
    public String toString() {
        return "MedicineList{" +
                "medicine_id='" + medicine_id + '\'' +
                ", prescription_id='" + prescription_id + '\'' +
                ", mian_doctor='" + mian_doctor + '\'' +
                ", drug_id='" + drug_id + '\'' +
                ", drug_name='" + drug_name + '\'' +
                ", patientname='" + patientname + '\'' +
                ", Total_cost=" + Total_cost +
                ", time='" + time + '\'' +
                '}';
    }

    public MedicineList(String medicine_id, String prescription_id, String mian_doctor, String drug_id, String drug_name, String patientname, Double total_cost, String time) {
        this.medicine_id = medicine_id;
        this.prescription_id = prescription_id;
        this.mian_doctor = mian_doctor;
        this.drug_id = drug_id;
        this.drug_name = drug_name;
        this.patientname = patientname;
        Total_cost = total_cost;
        this.time = time;
    }

    public String getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(String medicine_id) {
        this.medicine_id = medicine_id;
    }

    public String getPrescription_id() {
        return prescription_id;
    }

    public void setPrescription_id(String prescription_id) {
        this.prescription_id = prescription_id;
    }

    public String getMian_doctor() {
        return mian_doctor;
    }

    public void setMian_doctor(String mian_doctor) {
        this.mian_doctor = mian_doctor;
    }

    public String getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(String drug_id) {
        this.drug_id = drug_id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public Double getTotal_cost() {
        return Total_cost;
    }

    public void setTotal_cost(Double total_cost) {
        Total_cost = total_cost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
