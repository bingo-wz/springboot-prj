package com.bingo.controller;

import com.bingo.model.Student;
import com.bingo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    public String addStudent(String name,Integer age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        int rows = studentService.addStudent(student);
        return "添加学生："+rows;
    }

    @RequestMapping("/student/{stuId}")
    public String queryStudent(@PathVariable("stuId") Integer id){

        return studentService.queryById(id).toString();
    }

    @RequestMapping("/student")
    public String queryStudent(){
        return "欢迎你";
    }
}
