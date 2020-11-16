package com.qingan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomController {

    @RequestMapping("/r40")
    public String testError(){

        return "error404";

    }

    @RequestMapping("/demoError")
        public String demoError() throws Exception{
            throw new Exception("出现异常了...");
        }


}
