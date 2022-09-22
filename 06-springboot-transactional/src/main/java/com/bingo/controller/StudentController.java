package com.bingo.controller;

import com.bingo.model.Student;
import com.bingo.service.StudentService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class StudentController{

    @Resource
    private StudentService studentService;

    @PostMapping("/student/{name}/{age}")
    public String addStudent(@PathVariable String name,
                             @PathVariable Integer age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        System.out.println(student);
        int rows = studentService.addStudent(student);
        System.out.println("添加学生："+rows);
        return "success";
    }
//
    @GetMapping("/student/{id}")
    public String queryStudentById(@PathVariable Integer id){
        Student student = studentService.queryById(id);
        System.out.println(student);
        return "success";
    }

    @GetMapping("/student")
    public String queryAllStudent(){
        return "success";
    }
}
