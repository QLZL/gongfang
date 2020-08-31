package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author aqsus
 */
@Data
public class SysUser {

    private Long id;
    private String userName;
    private String passWord;
    private Date createTime;
    private Integer userAge;
    private String remark;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getUserName () {
        return userName;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public String getPassWord () {
        return passWord;
    }

    public void setPassWord (String passWord) {
        this.passWord = passWord;
    }

    public Date getCreateTime () {
        return createTime;
    }

    public void setCreateTime (Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserAge () {
        return userAge;
    }

    public void setUserAge (Integer userAge) {
        this.userAge = userAge;
    }

    public String getRemark () {
        return remark;
    }

    public void setRemark (String remark) {
        this.remark = remark;
    }
}
