package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.model.FileData;
import com.nt.service.StorageService;

@SpringBootApplication
public class FileStorageSystemProfileApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FileStorageSystemProfileApplication.class, args);
	}
	@Autowired
private StorageService service;
	@Override
	public void run(String... args) throws Exception {
		
		service.store(new FileData("Jayesh",5));
	}

}
