package com.qingan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class FilteringinterceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilteringinterceptionApplication.class, args);
    }

}
