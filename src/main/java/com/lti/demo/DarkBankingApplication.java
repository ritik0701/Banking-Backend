package com.lti.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DarkBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DarkBankingApplication.class, args);
		System.out.println("Bank app working");
	}

}
