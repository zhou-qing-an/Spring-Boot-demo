package com.qingan.controller;

import com.qingan.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.Date;


@Controller
public class TemplateController {

    @RequestMapping("/freeMarker")
    public String testFreeMarker(Model model){
        model.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
        return "/freemarker/index";
    }

    @RequestMapping("/thymeleaf")
    public String testThymeleaf(ModelMap modelMap){
//        modelMap.addAttribute("name","清安");
        modelMap.addAttribute("name","<span style='color:red'>清安</span>");
        return "/thymeleaf/index";
    }

    @RequestMapping("/expression")
    public String expression(ModelMap modelMap){
        //      创建餐厅对象
        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("黄晓明");
        restaurant.setChef("林大厨");
        modelMap.addAttribute("restaurant",restaurant);
        return "/thymeleaf/index";
    }

}
