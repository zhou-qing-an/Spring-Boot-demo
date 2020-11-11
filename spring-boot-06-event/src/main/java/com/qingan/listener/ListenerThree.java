package com.qingan.listener;

import com.qingan.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerThree {

    @EventListener
    public void onEvent(CustomEvent event){
        event.printMessage("ListenerThree监听到了");
    }

}
