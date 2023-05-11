//package com.controller;
//
//import com.events.EventPublisher;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1/event")
//public class EventController<T>  {
//
//    @Autowired
//    private EventPublisher eventPublisher;
//
//    @GetMapping(value = "/publishEvent")
//    public void getEvent()
//    {
//        eventPublisher.publishEvent();
//    }
//}
