package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.EmployeeRepository;
@Component
public class AppRunner implements CommandLineRunner{
@Autowired
private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
repo.findEmployeeByDepartment("IT");
		
System.out.println(repo.deleteEmployeeByDepartment("IT"));

	}

	
}
