package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nt.model.LogMessage;

@Service
@Profile("test")
public class FileLoggingService implements LoggingService{

	@Override
	public void log(LogMessage p) {
		System.out.println("Writing Log to File: "+p.getMessage());
	}

}
