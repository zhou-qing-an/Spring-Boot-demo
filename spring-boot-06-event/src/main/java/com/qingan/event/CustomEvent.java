package com.qingan.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public void printMessage(String mes) {
        System.out.println("自定义事件,打印信息:"+mes);
    }
}