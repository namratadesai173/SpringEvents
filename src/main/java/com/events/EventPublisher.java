package com.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Service
@RestController
@RequestMapping("/api/v1/event")
public class EventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping(value = "/publishEvent")
    public void publishEvent() {
        MessageEvent messageEvent = new MessageEvent(this);
        messageEvent.setMessage("Hello there");
        applicationEventPublisher.publishEvent(messageEvent);
    }

}
