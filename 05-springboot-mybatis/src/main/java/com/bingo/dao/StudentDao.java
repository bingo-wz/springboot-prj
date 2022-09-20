package com.bingo.dao;

import com.bingo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;

public interface StudentDao {

    Student selectById(@Param("stuId") Integer id);
}
