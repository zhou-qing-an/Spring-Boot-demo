package com.qingan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.qingan.mapper")
@SpringBootApplication
public class SpringBoot06MybatisPulsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06MybatisPulsApplication.class, args);
    }

}
