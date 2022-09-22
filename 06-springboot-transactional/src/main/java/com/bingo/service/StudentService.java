package com.bingo.service;

import com.bingo.model.Student;

public interface StudentService {

    int addStudent(Student student);

    Student queryById(Integer id);
}
