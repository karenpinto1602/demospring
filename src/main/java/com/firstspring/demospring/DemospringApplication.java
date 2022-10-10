package com.firstspring.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringApplication {

	public static void main(String[] args) {
		// this sets up the default configurations, starts the spring application
		// starts the tomcat server- allows to run java server pages
		SpringApplication.run(DemospringApplication.class, args);
	}

}
