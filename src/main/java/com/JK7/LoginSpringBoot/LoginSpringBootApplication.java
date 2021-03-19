package com.JK7.LoginSpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginSpringBootApplication {
	
	private static Logger LOG = LoggerFactory.getLogger(LoginSpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoginSpringBootApplication.class, args);
		
		LOG.info("----------------------------");
		LOG.info("-- INICIO LoginSpringBoot --");
		LOG.info("----------------------------");
	}

}
