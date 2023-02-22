package com.saksoft.springrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
public class SpringrestApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringrestApplication.class);
	public static void main(String[] args) {
		logger.info("Application started..");
		SpringApplication.run(SpringrestApplication.class, args);
	}
	
	
}
