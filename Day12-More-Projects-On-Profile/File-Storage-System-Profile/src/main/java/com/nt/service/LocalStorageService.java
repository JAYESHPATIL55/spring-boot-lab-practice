package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.model.FileData;

@Service
@Profile("dev")
public class LocalStorageService implements StorageService{

	@Override
	public void store(FileData u) {
		System.out.println("Sotring File Locally: "+u.getFileName());
	}

}
