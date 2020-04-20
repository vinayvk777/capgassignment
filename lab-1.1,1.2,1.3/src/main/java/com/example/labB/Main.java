package com.example.labB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Main.class, args);
		Employee e= context.getBean(Employee.class);
		e.show();
	}

}
