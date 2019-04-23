package com.chixing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCustIdIsNull() {
            addCriterion("customer.cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("customer.cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("customer.cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("customer.cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("customer.cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer.cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("customer.cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer.cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("customer.cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("customer.cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("customer.cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer.cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("customer.cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("customer.cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("customer.cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("customer.cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("customer.cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer.cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("customer.cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("customer.cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("customer.cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("customer.cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("customer.cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("customer.cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("customer.cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("customer.cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustPwdIsNull() {
            addCriterion("customer.cust_pwd is null");
            return (Criteria) this;
        }

        public Criteria andCustPwdIsNotNull() {
            addCriterion("customer.cust_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andCustPwdEqualTo(String value) {
            addCriterion("customer.cust_pwd =", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotEqualTo(String value) {
            addCriterion("customer.cust_pwd <>", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdGreaterThan(String value) {
            addCriterion("customer.cust_pwd >", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdGreaterThanOrEqualTo(String value) {
            addCriterion("customer.cust_pwd >=", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdLessThan(String value) {
            addCriterion("customer.cust_pwd <", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdLessThanOrEqualTo(String value) {
            addCriterion("customer.cust_pwd <=", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdLike(String value) {
            addCriterion("customer.cust_pwd like", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotLike(String value) {
            addCriterion("customer.cust_pwd not like", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdIn(List<String> values) {
            addCriterion("customer.cust_pwd in", values, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotIn(List<String> values) {
            addCriterion("customer.cust_pwd not in", values, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdBetween(String value1, String value2) {
            addCriterion("customer.cust_pwd between", value1, value2, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotBetween(String value1, String value2) {
            addCriterion("customer.cust_pwd not between", value1, value2, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustGenderIsNull() {
            addCriterion("customer.cust_gender is null");
            return (Criteria) this;
        }

        public Criteria andCustGenderIsNotNull() {
            addCriterion("customer.cust_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCustGenderEqualTo(String value) {
            addCriterion("customer.cust_gender =", value, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderNotEqualTo(String value) {
            addCriterion("customer.cust_gender <>", value, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderGreaterThan(String value) {
            addCriterion("customer.cust_gender >", value, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderGreaterThanOrEqualTo(String value) {
            addCriterion("customer.cust_gender >=", value, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderLessThan(String value) {
            addCriterion("customer.cust_gender <", value, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderLessThanOrEqualTo(String value) {
            addCriterion("customer.cust_gender <=", value, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderLike(String value) {
            addCriterion("customer.cust_gender like", value, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderNotLike(String value) {
            addCriterion("customer.cust_gender not like", value, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderIn(List<String> values) {
            addCriterion("customer.cust_gender in", values, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderNotIn(List<String> values) {
            addCriterion("customer.cust_gender not in", values, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderBetween(String value1, String value2) {
            addCriterion("customer.cust_gender between", value1, value2, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustGenderNotBetween(String value1, String value2) {
            addCriterion("customer.cust_gender not between", value1, value2, "custGender");
            return (Criteria) this;
        }

        public Criteria andCustTelnoIsNull() {
            addCriterion("customer.cust_telno is null");
            return (Criteria) this;
        }

        public Criteria andCustTelnoIsNotNull() {
            addCriterion("customer.cust_telno is not null");
            return (Criteria) this;
        }

        public Criteria andCustTelnoEqualTo(Long value) {
            addCriterion("customer.cust_telno =", value, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustTelnoNotEqualTo(Long value) {
            addCriterion("customer.cust_telno <>", value, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustTelnoGreaterThan(Long value) {
            addCriterion("customer.cust_telno >", value, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustTelnoGreaterThanOrEqualTo(Long value) {
            addCriterion("customer.cust_telno >=", value, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustTelnoLessThan(Long value) {
            addCriterion("customer.cust_telno <", value, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustTelnoLessThanOrEqualTo(Long value) {
            addCriterion("customer.cust_telno <=", value, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustTelnoIn(List<Long> values) {
            addCriterion("customer.cust_telno in", values, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustTelnoNotIn(List<Long> values) {
            addCriterion("customer.cust_telno not in", values, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustTelnoBetween(Long value1, Long value2) {
            addCriterion("customer.cust_telno between", value1, value2, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustTelnoNotBetween(Long value1, Long value2) {
            addCriterion("customer.cust_telno not between", value1, value2, "custTelno");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNull() {
            addCriterion("customer.cust_email is null");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNotNull() {
            addCriterion("customer.cust_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustEmailEqualTo(String value) {
            addCriterion("customer.cust_email =", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotEqualTo(String value) {
            addCriterion("customer.cust_email <>", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThan(String value) {
            addCriterion("customer.cust_email >", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThanOrEqualTo(String value) {
            addCriterion("customer.cust_email >=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThan(String value) {
            addCriterion("customer.cust_email <", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThanOrEqualTo(String value) {
            addCriterion("customer.cust_email <=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLike(String value) {
            addCriterion("customer.cust_email like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotLike(String value) {
            addCriterion("customer.cust_email not like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailIn(List<String> values) {
            addCriterion("customer.cust_email in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotIn(List<String> values) {
            addCriterion("customer.cust_email not in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailBetween(String value1, String value2) {
            addCriterion("customer.cust_email between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotBetween(String value1, String value2) {
            addCriterion("customer.cust_email not between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustBirthIsNull() {
            addCriterion("customer.cust_birth is null");
            return (Criteria) this;
        }

        public Criteria andCustBirthIsNotNull() {
            addCriterion("customer.cust_birth is not null");
            return (Criteria) this;
        }

        public Criteria andCustBirthEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_birth =", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_birth <>", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("customer.cust_birth >", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_birth >=", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthLessThan(Date value) {
            addCriterionForJDBCDate("customer.cust_birth <", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_birth <=", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthIn(List<Date> values) {
            addCriterionForJDBCDate("customer.cust_birth in", values, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer.cust_birth not in", values, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer.cust_birth between", value1, value2, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer.cust_birth not between", value1, value2, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustCountryIsNull() {
            addCriterion("customer.cust_country is null");
            return (Criteria) this;
        }

        public Criteria andCustCountryIsNotNull() {
            addCriterion("customer.cust_country is not null");
            return (Criteria) this;
        }

        public Criteria andCustCountryEqualTo(String value) {
            addCriterion("customer.cust_country =", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryNotEqualTo(String value) {
            addCriterion("customer.cust_country <>", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryGreaterThan(String value) {
            addCriterion("customer.cust_country >", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryGreaterThanOrEqualTo(String value) {
            addCriterion("customer.cust_country >=", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryLessThan(String value) {
            addCriterion("customer.cust_country <", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryLessThanOrEqualTo(String value) {
            addCriterion("customer.cust_country <=", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryLike(String value) {
            addCriterion("customer.cust_country like", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryNotLike(String value) {
            addCriterion("customer.cust_country not like", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryIn(List<String> values) {
            addCriterion("customer.cust_country in", values, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryNotIn(List<String> values) {
            addCriterion("customer.cust_country not in", values, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryBetween(String value1, String value2) {
            addCriterion("customer.cust_country between", value1, value2, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryNotBetween(String value1, String value2) {
            addCriterion("customer.cust_country not between", value1, value2, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustProvinceIsNull() {
            addCriterion("customer.cust_province is null");
            return (Criteria) this;
        }

        public Criteria andCustProvinceIsNotNull() {
            addCriterion("customer.cust_province is not null");
            return (Criteria) this;
        }

        public Criteria andCustProvinceEqualTo(String value) {
            addCriterion("customer.cust_province =", value, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceNotEqualTo(String value) {
            addCriterion("customer.cust_province <>", value, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceGreaterThan(String value) {
            addCriterion("customer.cust_province >", value, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("customer.cust_province >=", value, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceLessThan(String value) {
            addCriterion("customer.cust_province <", value, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceLessThanOrEqualTo(String value) {
            addCriterion("customer.cust_province <=", value, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceLike(String value) {
            addCriterion("customer.cust_province like", value, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceNotLike(String value) {
            addCriterion("customer.cust_province not like", value, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceIn(List<String> values) {
            addCriterion("customer.cust_province in", values, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceNotIn(List<String> values) {
            addCriterion("customer.cust_province not in", values, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceBetween(String value1, String value2) {
            addCriterion("customer.cust_province between", value1, value2, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustProvinceNotBetween(String value1, String value2) {
            addCriterion("customer.cust_province not between", value1, value2, "custProvince");
            return (Criteria) this;
        }

        public Criteria andCustCityIsNull() {
            addCriterion("customer.cust_city is null");
            return (Criteria) this;
        }

        public Criteria andCustCityIsNotNull() {
            addCriterion("customer.cust_city is not null");
            return (Criteria) this;
        }

        public Criteria andCustCityEqualTo(String value) {
            addCriterion("customer.cust_city =", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityNotEqualTo(String value) {
            addCriterion("customer.cust_city <>", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityGreaterThan(String value) {
            addCriterion("customer.cust_city >", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityGreaterThanOrEqualTo(String value) {
            addCriterion("customer.cust_city >=", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityLessThan(String value) {
            addCriterion("customer.cust_city <", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityLessThanOrEqualTo(String value) {
            addCriterion("customer.cust_city <=", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityLike(String value) {
            addCriterion("customer.cust_city like", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityNotLike(String value) {
            addCriterion("customer.cust_city not like", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityIn(List<String> values) {
            addCriterion("customer.cust_city in", values, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityNotIn(List<String> values) {
            addCriterion("customer.cust_city not in", values, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityBetween(String value1, String value2) {
            addCriterion("customer.cust_city between", value1, value2, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityNotBetween(String value1, String value2) {
            addCriterion("customer.cust_city not between", value1, value2, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustProfileIsNull() {
            addCriterion("customer.cust_profile is null");
            return (Criteria) this;
        }

        public Criteria andCustProfileIsNotNull() {
            addCriterion("customer.cust_profile is not null");
            return (Criteria) this;
        }

        public Criteria andCustProfileEqualTo(String value) {
            addCriterion("customer.cust_profile =", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileNotEqualTo(String value) {
            addCriterion("customer.cust_profile <>", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileGreaterThan(String value) {
            addCriterion("customer.cust_profile >", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileGreaterThanOrEqualTo(String value) {
            addCriterion("customer.cust_profile >=", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileLessThan(String value) {
            addCriterion("customer.cust_profile <", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileLessThanOrEqualTo(String value) {
            addCriterion("customer.cust_profile <=", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileLike(String value) {
            addCriterion("customer.cust_profile like", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileNotLike(String value) {
            addCriterion("customer.cust_profile not like", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileIn(List<String> values) {
            addCriterion("customer.cust_profile in", values, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileNotIn(List<String> values) {
            addCriterion("customer.cust_profile not in", values, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileBetween(String value1, String value2) {
            addCriterion("customer.cust_profile between", value1, value2, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileNotBetween(String value1, String value2) {
            addCriterion("customer.cust_profile not between", value1, value2, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustScoreIsNull() {
            addCriterion("customer.cust_score is null");
            return (Criteria) this;
        }

        public Criteria andCustScoreIsNotNull() {
            addCriterion("customer.cust_score is not null");
            return (Criteria) this;
        }

        public Criteria andCustScoreEqualTo(Integer value) {
            addCriterion("customer.cust_score =", value, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustScoreNotEqualTo(Integer value) {
            addCriterion("customer.cust_score <>", value, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustScoreGreaterThan(Integer value) {
            addCriterion("customer.cust_score >", value, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer.cust_score >=", value, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustScoreLessThan(Integer value) {
            addCriterion("customer.cust_score <", value, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustScoreLessThanOrEqualTo(Integer value) {
            addCriterion("customer.cust_score <=", value, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustScoreIn(List<Integer> values) {
            addCriterion("customer.cust_score in", values, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustScoreNotIn(List<Integer> values) {
            addCriterion("customer.cust_score not in", values, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustScoreBetween(Integer value1, Integer value2) {
            addCriterion("customer.cust_score between", value1, value2, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("customer.cust_score not between", value1, value2, "custScore");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNull() {
            addCriterion("customer.cust_level is null");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNotNull() {
            addCriterion("customer.cust_level is not null");
            return (Criteria) this;
        }

        public Criteria andCustLevelEqualTo(Integer value) {
            addCriterion("customer.cust_level =", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotEqualTo(Integer value) {
            addCriterion("customer.cust_level <>", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThan(Integer value) {
            addCriterion("customer.cust_level >", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer.cust_level >=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThan(Integer value) {
            addCriterion("customer.cust_level <", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThanOrEqualTo(Integer value) {
            addCriterion("customer.cust_level <=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelIn(List<Integer> values) {
            addCriterion("customer.cust_level in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotIn(List<Integer> values) {
            addCriterion("customer.cust_level not in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelBetween(Integer value1, Integer value2) {
            addCriterion("customer.cust_level between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("customer.cust_level not between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeIsNull() {
            addCriterion("customer.cust_regist_time is null");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeIsNotNull() {
            addCriterion("customer.cust_regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_regist_time =", value, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_regist_time <>", value, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("customer.cust_regist_time >", value, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_regist_time >=", value, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeLessThan(Date value) {
            addCriterionForJDBCDate("customer.cust_regist_time <", value, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_regist_time <=", value, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeIn(List<Date> values) {
            addCriterionForJDBCDate("customer.cust_regist_time in", values, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer.cust_regist_time not in", values, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer.cust_regist_time between", value1, value2, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustRegistTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer.cust_regist_time not between", value1, value2, "custRegistTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeIsNull() {
            addCriterion("customer.cust_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeIsNotNull() {
            addCriterion("customer.cust_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_update_time =", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_update_time <>", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("customer.cust_update_time >", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_update_time >=", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("customer.cust_update_time <", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer.cust_update_time <=", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("customer.cust_update_time in", values, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer.cust_update_time not in", values, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer.cust_update_time between", value1, value2, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer.cust_update_time not between", value1, value2, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustStatusIsNull() {
            addCriterion("customer.cust_status is null");
            return (Criteria) this;
        }

        public Criteria andCustStatusIsNotNull() {
            addCriterion("customer.cust_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustStatusEqualTo(Integer value) {
            addCriterion("customer.cust_status =", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotEqualTo(Integer value) {
            addCriterion("customer.cust_status <>", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusGreaterThan(Integer value) {
            addCriterion("customer.cust_status >", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer.cust_status >=", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLessThan(Integer value) {
            addCriterion("customer.cust_status <", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer.cust_status <=", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusIn(List<Integer> values) {
            addCriterion("customer.cust_status in", values, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotIn(List<Integer> values) {
            addCriterion("customer.cust_status not in", values, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer.cust_status between", value1, value2, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer.cust_status not between", value1, value2, "custStatus");
            return (Criteria) this;
        }

        public Criteria andOthers1IsNull() {
            addCriterion("customer.others1 is null");
            return (Criteria) this;
        }

        public Criteria andOthers1IsNotNull() {
            addCriterion("customer.others1 is not null");
            return (Criteria) this;
        }

        public Criteria andOthers1EqualTo(String value) {
            addCriterion("customer.others1 =", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotEqualTo(String value) {
            addCriterion("customer.others1 <>", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1GreaterThan(String value) {
            addCriterion("customer.others1 >", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1GreaterThanOrEqualTo(String value) {
            addCriterion("customer.others1 >=", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1LessThan(String value) {
            addCriterion("customer.others1 <", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1LessThanOrEqualTo(String value) {
            addCriterion("customer.others1 <=", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1Like(String value) {
            addCriterion("customer.others1 like", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotLike(String value) {
            addCriterion("customer.others1 not like", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1In(List<String> values) {
            addCriterion("customer.others1 in", values, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotIn(List<String> values) {
            addCriterion("customer.others1 not in", values, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1Between(String value1, String value2) {
            addCriterion("customer.others1 between", value1, value2, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotBetween(String value1, String value2) {
            addCriterion("customer.others1 not between", value1, value2, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers2IsNull() {
            addCriterion("customer.others2 is null");
            return (Criteria) this;
        }

        public Criteria andOthers2IsNotNull() {
            addCriterion("customer.others2 is not null");
            return (Criteria) this;
        }

        public Criteria andOthers2EqualTo(String value) {
            addCriterion("customer.others2 =", value, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2NotEqualTo(String value) {
            addCriterion("customer.others2 <>", value, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2GreaterThan(String value) {
            addCriterion("customer.others2 >", value, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2GreaterThanOrEqualTo(String value) {
            addCriterion("customer.others2 >=", value, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2LessThan(String value) {
            addCriterion("customer.others2 <", value, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2LessThanOrEqualTo(String value) {
            addCriterion("customer.others2 <=", value, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2Like(String value) {
            addCriterion("customer.others2 like", value, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2NotLike(String value) {
            addCriterion("customer.others2 not like", value, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2In(List<String> values) {
            addCriterion("customer.others2 in", values, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2NotIn(List<String> values) {
            addCriterion("customer.others2 not in", values, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2Between(String value1, String value2) {
            addCriterion("customer.others2 between", value1, value2, "others2");
            return (Criteria) this;
        }

        public Criteria andOthers2NotBetween(String value1, String value2) {
            addCriterion("customer.others2 not between", value1, value2, "others2");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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