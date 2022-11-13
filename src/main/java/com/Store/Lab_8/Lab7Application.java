package com.Store.Lab_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Lab7Application {
	@Autowired
	private String data;
	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
	}
	@GetMapping("/")
	public String hello(){
		return data;
	}

}
