package com.abatt.jpa.dao;

import com.abatt.jpa.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Author:YanKai
 * Date:2018/6/19
 * Time:9:49
 * Describe:student的数据库操作，CrudRepository父接口中已提供部分查询方法，如有自定义查询方法，可在本接口中定义
 */
@Repository
public interface StudentDAO extends CrudRepository<Student, Integer> {
}
