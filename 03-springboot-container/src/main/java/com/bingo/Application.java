package com.bingo;

import com.bingo.service.UserService;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Resource
    private UserService userService;

    public static void main(String[] args) {
        System.out.println("准备创建容器对象");
        SpringApplication.run(Application.class, args);
        System.out.println("创建容器对象之后");
    }

    @Override
    public void run(String... args) throws Exception {
        String sayHello = userService.sayHello("李四");
        System.out.println("在容器的对象创建好，执行的方法");
        System.out.println("调用容器中的对象="+sayHello);
    }
}
