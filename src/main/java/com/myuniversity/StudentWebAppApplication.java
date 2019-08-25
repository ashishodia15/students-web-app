package com.myuniversity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentWebAppApplication {

	public static void main(String[] args) {
		System.out.println("I am in Web Application");
		SpringApplication.run(StudentWebAppApplication.class, args);
		System.out.println("I am out of Web Application");
	}

}
