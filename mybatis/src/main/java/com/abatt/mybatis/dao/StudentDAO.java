package com.abatt.mybatis.dao;

import com.abatt.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author:YanKai
 * Date:2018/6/19
 * Time:11:35
 * Describe:
 */
@Mapper
@Repository
public interface StudentDAO {
    List<Student> getAll();

}
