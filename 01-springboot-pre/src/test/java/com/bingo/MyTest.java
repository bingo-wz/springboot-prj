package com.bingo;

import com.bingo.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("容器中的对象：" + student);
    }

}
