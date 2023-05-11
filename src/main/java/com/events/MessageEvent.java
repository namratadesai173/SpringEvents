package com.events;

import org.springframework.context.ApplicationEvent;

public class MessageEvent extends ApplicationEvent {

    String message;


    public MessageEvent(Object source) {
        super(source);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
