package com.hospital.hospital.domain;

import java.util.Date;

public class Registration {

    private String id;


    private Integer serialNum;

    private String departmentId;


    private String departmentName;


    private String employeeid;

    private String employeename;


    private String registrationId;


    private String registrationPerson;

    private Integer state;


    private Integer moneyState;

    private Double money;

    private Integer category;

    private String payWay;

    private Date registrationDate;

    private DataDictionary dataDictionaryCategory;

    private DataDictionary dataDictionaryMoneyState;

    public DataDictionary getDataDictionaryMoneyState() {
        return dataDictionaryMoneyState;
    }

    public void setDataDictionaryMoneyState(DataDictionary dataDictionaryMoneyState) {
        this.dataDictionaryMoneyState = dataDictionaryMoneyState;
    }

    public DataDictionary getDataDictionaryCategory() {
        return dataDictionaryCategory;
    }

    public void setDataDictionaryCategory(DataDictionary dataDictionaryCategory) {
        this.dataDictionaryCategory = dataDictionaryCategory;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id='" + id + '\'' +
                ", serialNum=" + serialNum +
                ", departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", employeeid='" + employeeid + '\'' +
                ", employeename='" + employeename + '\'' +
                ", registrationId='" + registrationId + '\'' +
                ", registrationPerson='" + registrationPerson + '\'' +
                ", state=" + state +
                ", moneyState=" + moneyState +
                ", money=" + money +
                ", category=" + category +
                ", payWay='" + payWay + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.id
     *
     * @return the value of registration.id
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.id
     *
     * @param id the value for registration.id
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.serial_num
     *
     * @return the value of registration.serial_num
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public Integer getSerialNum() {
        return serialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.serial_num
     *
     * @param serialNum the value for registration.serial_num
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.Department_id
     *
     * @return the value of registration.Department_id
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.Department_id
     *
     * @param departmentId the value for registration.Department_id
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.Department_name
     *
     * @return the value of registration.Department_name
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.Department_name
     *
     * @param departmentName the value for registration.Department_name
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.employeeId
     *
     * @return the value of registration.employeeId
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public String getEmployeeid() {
        return employeeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.employeeId
     *
     * @param employeeid the value for registration.employeeId
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.employeeName
     *
     * @return the value of registration.employeeName
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public String getEmployeename() {
        return employeename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.employeeName
     *
     * @param employeename the value for registration.employeeName
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.Registration_id
     *
     * @return the value of registration.Registration_id
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.Registration_id
     *
     * @param registrationId the value for registration.Registration_id
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId == null ? null : registrationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.Registration_person
     *
     * @return the value of registration.Registration_person
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public String getRegistrationPerson() {
        return registrationPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.Registration_person
     *
     * @param registrationPerson the value for registration.Registration_person
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setRegistrationPerson(String registrationPerson) {
        this.registrationPerson = registrationPerson == null ? null : registrationPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.state
     *
     * @return the value of registration.state
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.state
     *
     * @param state the value for registration.state
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.money_state
     *
     * @return the value of registration.money_state
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public Integer getMoneyState() {
        return moneyState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.money_state
     *
     * @param moneyState the value for registration.money_state
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setMoneyState(Integer moneyState) {
        this.moneyState = moneyState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.money
     *
     * @return the value of registration.money
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public Double getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.money
     *
     * @param money the value for registration.money
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.category
     *
     * @return the value of registration.category
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.category
     *
     * @param category the value for registration.category
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.pay_way
     *
     * @return the value of registration.pay_way
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public String getPayWay() {
        return payWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.pay_way
     *
     * @param payWay the value for registration.pay_way
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registration.Registration_date
     *
     * @return the value of registration.Registration_date
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registration.Registration_date
     *
     * @param registrationDate the value for registration.Registration_date
     *
     * @mbggenerated Mon Jan 21 18:56:09 CST 2019
     */
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}