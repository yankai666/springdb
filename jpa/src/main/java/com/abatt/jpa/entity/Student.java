package com.abatt.jpa.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Author:YanKai
 * Date:2018/6/19
 * Time:9:50
 * Describe:student 实体
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "id")
    private Integer id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(nullable = false, name = "age")
    private Integer age;

    /** 日期格式类*/
    @Column(nullable = false, name = "create_date")
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
