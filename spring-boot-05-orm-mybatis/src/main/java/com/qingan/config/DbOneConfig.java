package com.qingan.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.qingan.mapper",sqlSessionFactoryRef = "two")
public class DbOneConfig {


    @Autowired
    @Qualifier("db1")
    private DataSource dataSource;


    @Bean
    public SqlSessionFactory getFactory1() throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        return factory.getObject();
    }

    @Bean
    public SqlSessionTemplate getTemplate() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(getFactory1());
        return template;

    }

}
