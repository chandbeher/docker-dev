package com.bipros.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SqlServerDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlServerDockerDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "Hello Docker";
	}

}
