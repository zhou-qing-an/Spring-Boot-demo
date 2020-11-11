package com.qingan.listener;

import com.qingan.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class ListenerFour implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("ListenerFour监听到了");
    }
}
