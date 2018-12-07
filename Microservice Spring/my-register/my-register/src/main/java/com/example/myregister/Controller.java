package com.example.myregister;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
public class Controller {

String hello = "Register say hello %s";
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return String.format(hello, name);
	}
}
