package com.cognizant.authenticationservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The AuthenticationMsApplication class to start the application
 *
 */
@SpringBootApplication
@EnableSwagger2
public class AuthenticationMsApplication {
	

	
	/**
	 * The main method for app
	 */
	public static void main(String[] args) {
		SpringApplication.run(AuthenticationMsApplication.class, args);
	}
	
	

}
 