package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.model.LogMessage;
import com.nt.service.LoggingService;

@SpringBootApplication
public class LoggingProfileApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LoggingProfileApplication.class, args);
	}
	@Autowired
private LoggingService service;
	@Override
	public void run(String... args) throws Exception {
		
		service.log(new LogMessage(101,"Hey, Jayesh","5"));
	}

}
