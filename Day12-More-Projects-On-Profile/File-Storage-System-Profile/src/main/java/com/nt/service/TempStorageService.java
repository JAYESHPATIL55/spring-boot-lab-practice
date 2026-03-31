package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nt.model.FileData;

@Service
@Profile("prod")
public class TempStorageService implements StorageService{

	@Override
	public void store(FileData u) {
		System.out.println("Storing File in Temp Storage:  "+u.getFileName());
	}

}
