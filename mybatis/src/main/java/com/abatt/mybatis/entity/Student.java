package com.abatt.mybatis.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Author:YanKai
 * Date:2018/6/19
 * Time:9:50
 * Describe:student 实体
 */
public class Student {
    private Integer id;

    private String name;
    private String password;

    private Integer age;

    /** 日期格式类 */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    public Student() {
    }

    public Student(Integer id, String name, String password, Integer age, Date createDate) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
