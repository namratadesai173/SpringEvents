package com.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListner {

    @EventListener
    public void listenEvent(MessageEvent event) {
        System.out.println("Received event : "+event.getMessage());
    }
}
