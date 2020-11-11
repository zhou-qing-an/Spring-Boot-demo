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
@MapperScan(basePackages="com.qingan.mapper2",sqlSessionFactoryRef="getFactory1")
public class DbTwoConfig {

    @Autowired
    @Qualifier("db2")
    private DataSource dataSource;

    @Bean(name="two")
    public SqlSessionFactory getFactory2() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }


    @Bean
    public SqlSessionTemplate getTemplate2() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(getFactory2());
        return template;
    }

}
