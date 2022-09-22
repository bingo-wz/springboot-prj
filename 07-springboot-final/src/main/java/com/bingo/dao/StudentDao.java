package com.bingo.dao;


import com.bingo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentDao {
     Student queryById(@Param("stuId") Integer id);
     List<Student> queryAllStudent();
     void addStudent(Student student);

     void updateStudent(Student student);
}
