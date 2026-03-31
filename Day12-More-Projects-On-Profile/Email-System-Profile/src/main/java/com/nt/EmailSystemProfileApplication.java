package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.model.Email;
import com.nt.service.EmailService;

@SpringBootApplication
public class EmailSystemProfileApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmailSystemProfileApplication.class, args);
	}
	@Autowired
private EmailService service;
	@Override
	public void run(String... args) throws Exception {
		
		service.sendEmail(new Email("Jayesh","Car","successfully deliver"));
	}

}
