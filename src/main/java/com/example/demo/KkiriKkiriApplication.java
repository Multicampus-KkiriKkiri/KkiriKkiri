package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan
@ComponentScan(basePackages = "dao")
@ComponentScan(basePackages = "dto")
@ComponentScan(basePackages = "controller")
@ComponentScan(basePackages = "service")
@ComponentScan(basePackages = "chat")
@ComponentScan(basePackages = "fileupload")

public class KkiriKkiriApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(KkiriKkiriApplication.class, args);
		
		System.out.println("끼리끼리 Application start");
	}
}
