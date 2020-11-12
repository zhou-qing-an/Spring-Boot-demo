package com.qingan.config;

import com.qingan.interception.Interception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptionConfig implements WebMvcConfigurer {

    @Autowired
    private Interception interception;

    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(interception).addPathPatterns("/*");

    }

}
