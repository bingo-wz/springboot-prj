package com.bingo.service.impl;

import com.bingo.dao.StudentMapper;
import com.bingo.model.Student;
import com.bingo.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentDao;

    @Transactional
    @Override
    public int addStudent(Student student) {
        System.out.println("业务方法addStudent");
        int rows = studentDao.insert(student);
        System.out.println("执行sql语句");

//        int m = 10/0;

        return rows;
    }

    @Transactional
    @Override
    public Student queryById(Integer id) {
        return studentDao.selectByPrimaryKey(id);
    }
}
