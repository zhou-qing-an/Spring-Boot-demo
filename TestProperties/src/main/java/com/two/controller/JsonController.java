package com.two.controller;

import com.two.bean.Food;
import com.two.bean.Vegetable;
import com.two.cofing.FoodConfig;
import com.two.cofing.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    //      使用 @RestController
//    @RequestMapping("/json")
//    public String json(){
//        return " hello json";
//    }


   //       返回对象 自己new
//    @RequestMapping("/json")
//    public Food json(){
//        Food food = new Food();
//        food.setMeat("烤肉");
//        food.setRice("拌饭");
//        return food;
//    }

//    @Value("${food.meat}")
//    private String meat;
//
//    @Value("${food.rice}")
//    private String rice;
//
//    //      返回对象  Application.properties
//    @RequestMapping("/json")
//    public Food json(){
//        Food food = new Food();
//        food.setRice(rice);
//        food.setMeat(meat);
//        return food;
//    }


    //      自动注入对象
//    @Autowired
//   private FoodConfig fc;
//        //      通过绑定的bean获取
//    @RequestMapping("/json")
//    public Food json(){
//        Food food = new Food();
//        food.setRice(fc.getRice());
//        food.setMeat(fc.getMeat());
//        food.setSauce(fc.getSauce());
//        return food;
//    }


    @Autowired
   private VegetablesConfig vc;

    @RequestMapping("/vege")
    public Vegetable vege(){
        Vegetable v = new Vegetable();
        v.setPotato(vc.getPotato());
        v.setEggplant(vc.getEggplant());
        v.setGreenPepper(vc.getGreenPepper());
        return v;
    }

    @Value("${one.username}")
    private String username;
    @Value("${one.password}")
    private String password;

    @RequestMapping("/jasypt")
    public String jasypt(){
        StringBuilder builder = new StringBuilder();
        builder.append(username);
        builder.append("&");
        builder.append(password);
        return builder.toString();
    }

}
