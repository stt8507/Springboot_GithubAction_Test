package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerTest1Application.class, args);
	}
	
	@GetMapping("/")
	public String test() {
		return "Hello!";
	}

}
