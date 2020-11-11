package com.qingan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class SpringBoot07WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot07WebApplication.class, args);
    }


    @Bean
    public RouterFunction<ServerResponse> hello(){

        return route(GET("/hello"),
                request -> ok().body(Mono.just("Hello,world"),String.class));

    }



}
