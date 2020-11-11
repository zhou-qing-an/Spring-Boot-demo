package com.two;

import com.two.cofing.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//      告知Spring主入口
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class Main {

    public static void main(String[] args){
        //      静态方法启动
        SpringApplication.run(Main.class,args);

    }

}
