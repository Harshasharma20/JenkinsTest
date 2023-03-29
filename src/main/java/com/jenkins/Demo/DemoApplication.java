package com.jenkins.Demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	public static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
	public void check() {
		logger.info("Application started");
		logger.info("I'm learning jenkins");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
