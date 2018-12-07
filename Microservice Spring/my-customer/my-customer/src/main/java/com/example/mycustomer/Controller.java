package com.example.mycustomer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("customer")
@RestController
public class Controller {

	String hello = "Customer say hello %s";
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return String.format(hello, name);
	}
}
