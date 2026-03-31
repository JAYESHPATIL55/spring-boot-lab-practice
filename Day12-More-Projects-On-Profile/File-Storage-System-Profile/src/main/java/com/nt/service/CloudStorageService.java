package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nt.model.FileData;

@Service
@Profile("test")
public class CloudStorageService implements StorageService{

	@Override
	public void store(FileData p) {
		System.out.println("Uploading file to Cloud: "+p.getFileName());
	}

}
