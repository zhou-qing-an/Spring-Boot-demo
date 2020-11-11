package com.qingan.listener;

import com.qingan.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerTwo implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("ListenerTwo监听到了");
    }
}
