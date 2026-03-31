package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.model.LogMessage;

@Service
@Profile("dev")
public class DatabaseLoggingService implements LoggingService{

	@Override
	public void log(LogMessage p) {
		System.out.println("Saving Log to DB: "+p.getMessage());
	}

}
