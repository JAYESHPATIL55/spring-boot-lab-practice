package com.nt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nt.model.Email;


@Service
public class Profile implements EmailService{

	@Value("${email.dev.sender}")
	String sender;
	@Override
	public void sendEmail(Email u) {
		System.out.println("Dev Email sent from : "+sender);
	}

}
