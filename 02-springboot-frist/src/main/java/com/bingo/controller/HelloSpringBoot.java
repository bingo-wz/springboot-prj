package com.bingo.controller;

import com.bingo.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class HelloSpringBoot {

    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String name;

    @Value("${site}")
    private String site;

    @Resource
    private SchoolInfo info;

    @RequestMapping("/")
    @ResponseBody
    public String helloSpringBoot(){
        return name+",site="+site+"项目的访问地址："+contextPath+"，使用的端口："+port;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String queryInfo(){
        return "SchoolInfo=="+info.toString();
    }
}
