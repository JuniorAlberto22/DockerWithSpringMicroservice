package com.example.myregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRegisterApplication.class, args);
	}
}
