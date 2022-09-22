package com.bingo.service;

import com.bingo.model.Student;

import java.util.List;

public interface StudentService {

    Student queryById(Integer id);

    List<Student> queryAllStudent();

    void addStudent(Student student);

    void updateStudent(Student student);
}
