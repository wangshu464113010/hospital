package com.hospital.hospital.domain;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public PrescriptionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIsNull() {
            addCriterion("Drug_usage is null");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIsNotNull() {
            addCriterion("Drug_usage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugUsageEqualTo(String value) {
            addCriterion("Drug_usage =", value, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageNotEqualTo(String value) {
            addCriterion("Drug_usage <>", value, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageGreaterThan(String value) {
            addCriterion("Drug_usage >", value, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageGreaterThanOrEqualTo(String value) {
            addCriterion("Drug_usage >=", value, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageLessThan(String value) {
            addCriterion("Drug_usage <", value, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageLessThanOrEqualTo(String value) {
            addCriterion("Drug_usage <=", value, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageLike(String value) {
            addCriterion("Drug_usage like", value, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageNotLike(String value) {
            addCriterion("Drug_usage not like", value, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageIn(List<String> values) {
            addCriterion("Drug_usage in", values, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageNotIn(List<String> values) {
            addCriterion("Drug_usage not in", values, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageBetween(String value1, String value2) {
            addCriterion("Drug_usage between", value1, value2, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andDrugUsageNotBetween(String value1, String value2) {
            addCriterion("Drug_usage not between", value1, value2, "drugUsage");
            return (Criteria) this;
        }

        public Criteria andSingleDoseIsNull() {
            addCriterion("Single_dose is null");
            return (Criteria) this;
        }

        public Criteria andSingleDoseIsNotNull() {
            addCriterion("Single_dose is not null");
            return (Criteria) this;
        }

        public Criteria andSingleDoseEqualTo(String value) {
            addCriterion("Single_dose =", value, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseNotEqualTo(String value) {
            addCriterion("Single_dose <>", value, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseGreaterThan(String value) {
            addCriterion("Single_dose >", value, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseGreaterThanOrEqualTo(String value) {
            addCriterion("Single_dose >=", value, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseLessThan(String value) {
            addCriterion("Single_dose <", value, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseLessThanOrEqualTo(String value) {
            addCriterion("Single_dose <=", value, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseLike(String value) {
            addCriterion("Single_dose like", value, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseNotLike(String value) {
            addCriterion("Single_dose not like", value, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseIn(List<String> values) {
            addCriterion("Single_dose in", values, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseNotIn(List<String> values) {
            addCriterion("Single_dose not in", values, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseBetween(String value1, String value2) {
            addCriterion("Single_dose between", value1, value2, "singleDose");
            return (Criteria) this;
        }

        public Criteria andSingleDoseNotBetween(String value1, String value2) {
            addCriterion("Single_dose not between", value1, value2, "singleDose");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("Frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("Frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("Frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("Frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("Frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("Frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("Frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("Frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("Frequency like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("Frequency not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("Frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("Frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("Frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("Frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(String value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(String value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(String value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(String value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(String value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(String value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLike(String value) {
            addCriterion("total like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotLike(String value) {
            addCriterion("total not like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<String> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<String> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(String value1, String value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(String value1, String value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdIsNull() {
            addCriterion("medical_record_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdIsNotNull() {
            addCriterion("medical_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdEqualTo(String value) {
            addCriterion("medical_record_id =", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotEqualTo(String value) {
            addCriterion("medical_record_id <>", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdGreaterThan(String value) {
            addCriterion("medical_record_id >", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("medical_record_id >=", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdLessThan(String value) {
            addCriterion("medical_record_id <", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdLessThanOrEqualTo(String value) {
            addCriterion("medical_record_id <=", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdLike(String value) {
            addCriterion("medical_record_id like", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotLike(String value) {
            addCriterion("medical_record_id not like", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdIn(List<String> values) {
            addCriterion("medical_record_id in", values, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotIn(List<String> values) {
            addCriterion("medical_record_id not in", values, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdBetween(String value1, String value2) {
            addCriterion("medical_record_id between", value1, value2, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotBetween(String value1, String value2) {
            addCriterion("medical_record_id not between", value1, value2, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdIsNull() {
            addCriterion("Drug_details_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdIsNotNull() {
            addCriterion("Drug_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdEqualTo(String value) {
            addCriterion("Drug_details_id =", value, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdNotEqualTo(String value) {
            addCriterion("Drug_details_id <>", value, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdGreaterThan(String value) {
            addCriterion("Drug_details_id >", value, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("Drug_details_id >=", value, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdLessThan(String value) {
            addCriterion("Drug_details_id <", value, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("Drug_details_id <=", value, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdLike(String value) {
            addCriterion("Drug_details_id like", value, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdNotLike(String value) {
            addCriterion("Drug_details_id not like", value, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdIn(List<String> values) {
            addCriterion("Drug_details_id in", values, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdNotIn(List<String> values) {
            addCriterion("Drug_details_id not in", values, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdBetween(String value1, String value2) {
            addCriterion("Drug_details_id between", value1, value2, "drugDetailsId");
            return (Criteria) this;
        }

        public Criteria andDrugDetailsIdNotBetween(String value1, String value2) {
            addCriterion("Drug_details_id not between", value1, value2, "drugDetailsId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prescription
     *
     * @mbggenerated do_not_delete_during_merge Wed Jan 16 18:35:15 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prescription
     *
     * @mbggenerated Wed Jan 16 18:35:15 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}