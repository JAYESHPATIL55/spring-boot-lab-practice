package com.nt.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			Optional<Employee> emp =repository.findBySalaryGreaterThan(50000.00);
			if(emp.isPresent()) {
				System.out.println(" "+emp.get());
			}
			else {
				System.out.println("Is Empty");
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}
	
}