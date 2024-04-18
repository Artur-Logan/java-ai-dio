package com.arturlogan.javaaidio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class JavaAiDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAiDioApplication.class, args);
	}

}
