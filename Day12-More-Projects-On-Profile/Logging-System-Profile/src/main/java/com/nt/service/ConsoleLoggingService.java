package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nt.model.LogMessage;

@Service
@Profile("prod")
public class ConsoleLoggingService implements LoggingService{

	@Override
	public void log(LogMessage p) {
		System.out.println("Console Log: "+p.getMessage());
	}

}
