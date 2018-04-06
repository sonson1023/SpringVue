package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


 @Controller
@SpringBootApplication
public class MyVueSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyVueSpringBootApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String getHello() {
		return "hello";
	}
	
	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}
}
