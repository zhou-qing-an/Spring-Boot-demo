package com.qingan.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public ApplicationRunner runner(WebServerApplicationContext context){

        return args -> {
            System.out.println("WebServerApplicationContext ---当前webserver的实现类为:"+context.getWebServer().getClass().getName());
        };
    }
}
