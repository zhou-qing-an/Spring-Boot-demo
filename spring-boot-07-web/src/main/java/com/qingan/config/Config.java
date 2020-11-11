package com.qingan.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer(){

        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>(){

            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(7888);
            }
        };

    }

}
