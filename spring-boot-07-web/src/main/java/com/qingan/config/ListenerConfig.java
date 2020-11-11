package com.qingan.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerConfig {

    @EventListener
    public void onWebServer(WebServerInitializedEvent event){

        System.out.println("Listener的当前类为:"+event.getWebServer().getClass().getName());
    }
}
