package com.example.mysale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sale")
public class Controller {

String hello = "Sale say hello %s";
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return String.format(hello, name);
	}
	
}
