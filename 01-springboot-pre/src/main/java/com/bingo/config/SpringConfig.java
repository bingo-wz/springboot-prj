package com.bingo.config;

import com.bingo.vo.Student;
import org.springframework.context.annotation.*;

@ImportResource(value = "classpath:beans.xml")
@Configuration
@PropertySource("classpath:tiger.properties")
@ComponentScan("com.bingo.vo")
public class SpringConfig {

    @Bean
    public Student createStudent(){
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(24);
        s1.setSex("男");
        return s1;
    }

    @Bean(name = "LisiStudent")
    public Student newStudent(){
        Student s1 = new Student();
        s1.setName("李四");
        s1.setAge(24);
        s1.setSex("女");
        return s1;
    }
}
