package com.bingo;

import com.bingo.config.SpringConfig;
import com.bingo.vo.Student;
import com.bingo.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("容器中的对象：" + student);
    }

    /**
     * 使用JavaConfig和Bean
     */
    @Test
    public void test02(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("createStudent");
        System.out.println("容器中的对象：" + student);
    }

    @Test
    public void test03(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("LisiStudent");
        System.out.println("容器中的对象：" + student);
    }

    @Test
    public void test04(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("容器中的对象：" + student);
    }

    @Test
    public void test05(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) ctx.getBean("tiger");
        System.out.println("容器中的对象：" + tiger);
    }
}
