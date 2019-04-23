package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * customer
 * @author 
 */
public class Customer implements Serializable {
    /**
     * 用户id
     */
    private Integer custId;

    /**
     * 用户姓名
     */
    private String custName;

    /**
     * 用户密码
     */
    private String custPwd;

    /**
     * 性别
     */
    private String custGender;

    /**
     * 手机号码
     */
    private Long custTelno;

    /**
     * 邮箱
     */
    private String custEmail;

    /**
     * 出生日期
     */
    private Date custBirth;

    /**
     * 国家
     */
    private String custCountry;

    /**
     * 省份
     */
    private String custProvince;

    /**
     * 城市
     */
    private String custCity;

    /**
     * 头像
     */
    private String custProfile;

    /**
     * 积分
     */
    private Integer custScore;

    /**
     * 等级
     */
    private Integer custLevel;

    /**
     * 注册时间
     */
    private Date custRegistTime;

    /**
     * 修改时间
     */
    private Date custUpdateTime;

    /**
     * 状态
     */
    private Integer custStatus;

    /**
     * 个人简介
     */
    private String others1;

    /**
     * 备用字段2
     */
    private String others2;

    private static final long serialVersionUID = 1L;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPwd() {
        return custPwd;
    }

    public void setCustPwd(String custPwd) {
        this.custPwd = custPwd;
    }

    public String getCustGender() {
        return custGender;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public Long getCustTelno() {
        return custTelno;
    }

    public void setCustTelno(Long custTelno) {
        this.custTelno = custTelno;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public Date getCustBirth() {
        return custBirth;
    }

    public void setCustBirth(Date custBirth) {
        this.custBirth = custBirth;
    }

    public String getCustCountry() {
        return custCountry;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }

    public String getCustProvince() {
        return custProvince;
    }

    public void setCustProvince(String custProvince) {
        this.custProvince = custProvince;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustProfile() {
        return custProfile;
    }

    public void setCustProfile(String custProfile) {
        this.custProfile = custProfile;
    }

    public Integer getCustScore() {
        return custScore;
    }

    public void setCustScore(Integer custScore) {
        this.custScore = custScore;
    }

    public Integer getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(Integer custLevel) {
        this.custLevel = custLevel;
    }

    public Date getCustRegistTime() {
        return custRegistTime;
    }

    public void setCustRegistTime(Date custRegistTime) {
        this.custRegistTime = custRegistTime;
    }

    public Date getCustUpdateTime() {
        return custUpdateTime;
    }

    public void setCustUpdateTime(Date custUpdateTime) {
        this.custUpdateTime = custUpdateTime;
    }

    public Integer getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(Integer custStatus) {
        this.custStatus = custStatus;
    }

    public String getOthers1() {
        return others1;
    }

    public void setOthers1(String others1) {
        this.others1 = others1;
    }

    public String getOthers2() {
        return others2;
    }

    public void setOthers2(String others2) {
        this.others2 = others2;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustPwd() == null ? other.getCustPwd() == null : this.getCustPwd().equals(other.getCustPwd()))
            && (this.getCustGender() == null ? other.getCustGender() == null : this.getCustGender().equals(other.getCustGender()))
            && (this.getCustTelno() == null ? other.getCustTelno() == null : this.getCustTelno().equals(other.getCustTelno()))
            && (this.getCustEmail() == null ? other.getCustEmail() == null : this.getCustEmail().equals(other.getCustEmail()))
            && (this.getCustBirth() == null ? other.getCustBirth() == null : this.getCustBirth().equals(other.getCustBirth()))
            && (this.getCustCountry() == null ? other.getCustCountry() == null : this.getCustCountry().equals(other.getCustCountry()))
            && (this.getCustProvince() == null ? other.getCustProvince() == null : this.getCustProvince().equals(other.getCustProvince()))
            && (this.getCustCity() == null ? other.getCustCity() == null : this.getCustCity().equals(other.getCustCity()))
            && (this.getCustProfile() == null ? other.getCustProfile() == null : this.getCustProfile().equals(other.getCustProfile()))
            && (this.getCustScore() == null ? other.getCustScore() == null : this.getCustScore().equals(other.getCustScore()))
            && (this.getCustLevel() == null ? other.getCustLevel() == null : this.getCustLevel().equals(other.getCustLevel()))
            && (this.getCustRegistTime() == null ? other.getCustRegistTime() == null : this.getCustRegistTime().equals(other.getCustRegistTime()))
            && (this.getCustUpdateTime() == null ? other.getCustUpdateTime() == null : this.getCustUpdateTime().equals(other.getCustUpdateTime()))
            && (this.getCustStatus() == null ? other.getCustStatus() == null : this.getCustStatus().equals(other.getCustStatus()))
            && (this.getOthers1() == null ? other.getOthers1() == null : this.getOthers1().equals(other.getOthers1()))
            && (this.getOthers2() == null ? other.getOthers2() == null : this.getOthers2().equals(other.getOthers2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustPwd() == null) ? 0 : getCustPwd().hashCode());
        result = prime * result + ((getCustGender() == null) ? 0 : getCustGender().hashCode());
        result = prime * result + ((getCustTelno() == null) ? 0 : getCustTelno().hashCode());
        result = prime * result + ((getCustEmail() == null) ? 0 : getCustEmail().hashCode());
        result = prime * result + ((getCustBirth() == null) ? 0 : getCustBirth().hashCode());
        result = prime * result + ((getCustCountry() == null) ? 0 : getCustCountry().hashCode());
        result = prime * result + ((getCustProvince() == null) ? 0 : getCustProvince().hashCode());
        result = prime * result + ((getCustCity() == null) ? 0 : getCustCity().hashCode());
        result = prime * result + ((getCustProfile() == null) ? 0 : getCustProfile().hashCode());
        result = prime * result + ((getCustScore() == null) ? 0 : getCustScore().hashCode());
        result = prime * result + ((getCustLevel() == null) ? 0 : getCustLevel().hashCode());
        result = prime * result + ((getCustRegistTime() == null) ? 0 : getCustRegistTime().hashCode());
        result = prime * result + ((getCustUpdateTime() == null) ? 0 : getCustUpdateTime().hashCode());
        result = prime * result + ((getCustStatus() == null) ? 0 : getCustStatus().hashCode());
        result = prime * result + ((getOthers1() == null) ? 0 : getOthers1().hashCode());
        result = prime * result + ((getOthers2() == null) ? 0 : getOthers2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custPwd=").append(custPwd);
        sb.append(", custGender=").append(custGender);
        sb.append(", custTelno=").append(custTelno);
        sb.append(", custEmail=").append(custEmail);
        sb.append(", custBirth=").append(custBirth);
        sb.append(", custCountry=").append(custCountry);
        sb.append(", custProvince=").append(custProvince);
        sb.append(", custCity=").append(custCity);
        sb.append(", custProfile=").append(custProfile);
        sb.append(", custScore=").append(custScore);
        sb.append(", custLevel=").append(custLevel);
        sb.append(", custRegistTime=").append(custRegistTime);
        sb.append(", custUpdateTime=").append(custUpdateTime);
        sb.append(", custStatus=").append(custStatus);
        sb.append(", others1=").append(others1);
        sb.append(", others2=").append(others2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}