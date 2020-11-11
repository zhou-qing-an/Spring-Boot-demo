package com.two.cofing;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "vc")
@PropertySource("classpath:vegetable.properties")
@Data
public class VegetablesConfig {

    private String potato;
    private String eggplant;
    private String greenPepper;

   }
