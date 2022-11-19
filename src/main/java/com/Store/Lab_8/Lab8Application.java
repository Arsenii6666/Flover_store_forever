package com.Store.Lab_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Lab8Application {
	@Autowired
	private String data;
	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}
	@GetMapping
	public String hello(){
		return data;
	}

}
