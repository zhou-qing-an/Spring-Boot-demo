package com.qingan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *      添加一个配置类  @Configuration
 * @EnableSwagger2  开启Swagger功能
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     *        返回Docket对象交给Spring管理
     *        new Docket(DocumentationType.SWAGGER_2) 设置Swagger版本号
     *        .select()获取设置apis() 和 paths的对象
     *        apis()找查哪些生成controller的接口   RequestHandlerSelectors.any()查找所有
     *        RequestHandlerSelectors.basePackage("路径")自定义哪个包下的controller
     *        paths()在找查的controller中进行筛选   PathSelectors.any()全选
     *        build创建Docket对象
     *        apiInfo()  设置文档标题,版本,描述等....
     * @return
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.qingan.controller"))
                .paths(PathSelectors.any()).build().apiInfo(apiInfo());

    }


    /**
     *      自定义文档的介绍
     *      可以使用ApiInfoBuilder创建ApiInfo并且设置标题,描述,版本号等....
     *      使用.build() 返回ApiInfo对象
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("spring-boot-qingan-swagger2")
                .description("swagger的小Demo")
                .version("1.0")
                .build();
    }

}
