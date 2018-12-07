package com.example.myproduct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("product")
@RestController
public class Controller {

	String hello = "Product say hello %s";
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return String.format(hello, name);
	}
}
