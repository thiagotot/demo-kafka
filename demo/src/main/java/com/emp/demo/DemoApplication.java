package com.emp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("TC>>>>>>>" + DemoApplication.class.getClassLoader().getResource("application.properties"));

		SpringApplication.run(DemoApplication.class, args);

	}

}
