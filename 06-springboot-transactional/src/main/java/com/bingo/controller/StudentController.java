package com.bingo.controller;

import com.bingo.model.Student;
import com.bingo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

//    @PostMapping("/student/{name}/{age}")
//    public String addStudent(@PathVariable String name,
//                             @PathVariable Integer age){
//        Student student = new Student();
//        student.setName(name);
//        student.setAge(age);
//        int rows = studentService.addStudent(student);
//        return "添加学生："+rows;
//    }
//
//    @GetMapping("/student/{id}")
//    public String queryStudentById(@PathVariable Integer id){
//
//        return studentService.queryById(id).toString();
//    }

    @GetMapping("/success")
    public String queryAllStudent(){
        return "success";
    }
}
