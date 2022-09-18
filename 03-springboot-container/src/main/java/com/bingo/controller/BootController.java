package com.bingo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {

    @RequestMapping("/user/login")
    @ResponseBody
    private String userLogin(){
        return "欢迎登录";
    }

    @RequestMapping("/user/account")
    @ResponseBody
    private String userAccount(){
        return "欢迎使用";
    }
}
