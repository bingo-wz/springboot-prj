package com.bingo.service.impl;

import com.bingo.service.UserService;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        return "你好："+name;
    }
}
