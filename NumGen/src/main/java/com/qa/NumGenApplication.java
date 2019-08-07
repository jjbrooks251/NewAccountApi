package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NumGenApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(NumGenApplication.class, args);
	}

}
