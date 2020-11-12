package com.qingan.config;

import com.qingan.filter.FilterOne;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *      Filter 配置类用 @Configuration注解声明
 */
@Configuration
public class FilterConfig {

    //      将FilterRegistrationBran对象交给Spring管理
    @Bean
    public FilterRegistrationBean<FilterOne> registration(){
        //      创建FilterRegistrationBean 对象
        FilterRegistrationBean<FilterOne> registrationBean = new FilterRegistrationBean<>();
        //      设置过滤器
        registrationBean.setFilter(new FilterOne());
        //      设置路径
        registrationBean.addUrlPatterns("/*");
        //      设置执行顺序   越小越先执行  最小0
        registrationBean.setOrder(0);
        //      返回此对象
        return registrationBean;
    }

}
