package com.example.demo.controller;

import com.example.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/6/3 19:52
 */
@RestController
public class DockerTestController {


    @GetMapping("/hello")
    public String hello(){
        System.out.println("测试hello接口被调用");
        return "Hello Docker !!!!";
    }

    @GetMapping("/fuck")
    public String fuck(){
        System.out.println("测试fuck接口被调用");
        return "fuck Docker !!!!";
    }

    @GetMapping("/newOne")
    public String newOne(){
        System.out.println("测试new接口被调用");
        return "docker commit的镜像";
    }

}
