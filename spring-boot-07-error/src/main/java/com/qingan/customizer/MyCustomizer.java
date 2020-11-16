package com.qingan.customizer;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 *      自定义一个配置类
 *      自定义方法将WebServerFactoryCustomizer对象交给Spring
 */

@Configuration
public class MyCustomizer {

    //      返回一个匿名实现类
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer(){

        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                //      创建异常页对象
                ErrorPage errorpage = new ErrorPage(HttpStatus.NOT_FOUND,"/error404");
                //      将对象添加到Factory
                factory.addErrorPages(errorpage);

            }
        };

    }
}
