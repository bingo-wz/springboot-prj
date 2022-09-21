package com.bingo.service.impl;

import com.bingo.model.Student;
import com.bingo.service.StudentService;
import com.bingo.dao.StudentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryById(Integer id) {
        Student student = studentDao.queryById(id);
        return student;
    }
}
