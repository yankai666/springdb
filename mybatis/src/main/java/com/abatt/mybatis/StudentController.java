package com.abatt.mybatis;

import com.abatt.mybatis.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:YanKai
 * Date:2018/6/19
 * Time:11:47
 * Describe:
 */
@RestController
public class StudentController {
    @Autowired
    private StudentDAO dao;

    @GetMapping("/getAll")
    public Object getAll() {

        return dao.getAll();
    }
}
