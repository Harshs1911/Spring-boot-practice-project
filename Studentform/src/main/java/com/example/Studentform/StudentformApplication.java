package com.example.Studentform;

import org.apache.catalina.User;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.com.example.Studentform"})

@SpringBootApplication
public class StudentformApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentformApplication.class, args);
	
		
	
	}

}
