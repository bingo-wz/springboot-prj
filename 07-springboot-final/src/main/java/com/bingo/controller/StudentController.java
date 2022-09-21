package com.bingo.controller;

import com.bingo.dao.StudentDao;
import com.bingo.model.Student;
import com.bingo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("student/{id}")
    public String queryById(@PathVariable Integer id){
        Student student = studentService.queryById(id);
        System.out.println(student);
        return "success";
    }

}
