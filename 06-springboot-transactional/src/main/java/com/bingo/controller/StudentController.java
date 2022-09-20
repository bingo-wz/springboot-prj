package com.bingo.controller;

import com.bingo.model.Student;
import com.bingo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(String name,Integer age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        int rows = studentService.addStudent(student);
        return "添加学生："+rows;
    }

    @RequestMapping("/queryStudent")
    @ResponseBody
    public String queryStudent(Integer id){

        return studentService.queryById(id).toString();
    }

    @RequestMapping("/student")
    @ResponseBody
    public String queryStudent(){
        return "欢迎你";
    }
}
