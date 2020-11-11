package com.qingan;

import com.qingan.listener.ListenerOne;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot06EventApplication {

    public static void main(String[] args) {
      ConfigurableApplicationContext ac = SpringApplication.run(SpringBoot06EventApplication.class, args);
      ac.addApplicationListener(new ListenerOne());
    }

}
