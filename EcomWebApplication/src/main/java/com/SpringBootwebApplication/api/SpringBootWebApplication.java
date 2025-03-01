package com.SpringBootwebApplication.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
public class SpringBootWebApplication {

	public static void main(String[] args) {
	     /*ApplicationContext applicationContext =*/
		SpringApplication.run(SpringBootWebApplication.class, args);
		
		 /*for (String name: applicationContext.getBeanDefinitionNames()) {
	         System.out.println(name);
	     }*/
	}

	
	
}
