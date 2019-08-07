package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CharGenApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(CharGenApplication.class, args);
	}

}
