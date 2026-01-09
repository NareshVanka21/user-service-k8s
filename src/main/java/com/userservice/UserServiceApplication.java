package com.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.persistence.autoconfigure.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableJpaRepositories(basePackages = "com.userservice.repository")
//@EntityScan(basePackages = "com.userservice.DTO")
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@GetMapping("message")
	public String greetings(){
		return "Congratulations you successfully deployed your application to kubernetes";
	}
}
