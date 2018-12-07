package com.example.myproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProductApplication.class, args);
	}
}
