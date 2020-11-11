package com.qingan.listener;

import com.qingan.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class ListenerOne implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {

        event.printMessage("ListenerOne监听到了");

    }
}
