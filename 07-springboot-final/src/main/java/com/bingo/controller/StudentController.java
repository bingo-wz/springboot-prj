package com.bingo.controller;

import com.bingo.dao.StudentDao;
import com.bingo.model.Student;
import com.bingo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;


//    @GetMapping("student/{id}")
//    public String queryById(@PathVariable Integer id,Model model){
//        Student student = studentService.queryById(id);
//        model.addAttribute("student",student);
//        return "student_list";
//    }

    @GetMapping("student")
    public String queryAllStudent(Model model){
        List<Student> list = studentService.queryAllStudent();
        model.addAttribute("list",list);
        return "student_list";
    }

    @GetMapping("addStudent")
    public String toAddStudent(){
        return "addStudent";
    }


    @PostMapping("student")
    public String addStudent(Student student){
        studentService.addStudent(student);
        return "redirect:/student";
    }

    @GetMapping("student/{id}")
    public String toUpdate(@PathVariable Integer id,Model model){
        Student student = studentService.queryById(id);
        model.addAttribute("student",student);
        return "student_update";
    }

    @DeleteMapping("student/{id}")
    public String deleteStudent(@PathVariable Integer id){
        System.out.println("删除学生测试成功");
        return "success";
    }

    @PutMapping("student/updateStudent")
    public String updateStudent(Student student){
        studentService.updateStudent(student);
        return "redirect:/student";
    }
}
