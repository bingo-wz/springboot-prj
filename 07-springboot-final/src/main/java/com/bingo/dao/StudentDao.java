package com.bingo.dao;


import com.bingo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentDao {
     Student queryById(@Param("sudId") Integer id);
}
