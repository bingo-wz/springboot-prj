package com.bingo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FilterController {

    @RequestMapping("/user/filter")
    @ResponseBody
    public String userFilter(){
        return "user/filter";
    }


}
