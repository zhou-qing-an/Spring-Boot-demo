package com.qingan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println(".............servlet  执行了.........");
        return "Hello Mr.Tree!";
    }

}
