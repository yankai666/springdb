package com.abatt.jpa.controller;

import com.abatt.jpa.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author:YanKai
 * Date:2018/6/19
 * Time:9:49
 * Describe:
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentDAO dao;

    @GetMapping()
    public Object findAll() {
        Iterable all = dao.findAll();

        return all;
    }

    @PostMapping()
    public void save() {

    }

    @PutMapping()
    public void update() {
    }

    @DeleteMapping()
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

}
