package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "main.java")
public class SpringEventsApplication {

	//@Autowired
	//public static EventPublisher eventPublisher;

	public static void main(String[] args) {
		//eventPublisher.publishEvent();
		SpringApplication.run(SpringEventsApplication.class, args);
	}

}
