package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employees;
import com.nt.reposiotry.IEmployeeRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {

		Iterable<Employees> emp = repo.findEmployeeByDepartment("IT");
		emp.forEach(System.out::println);
		
		Iterable<Employees> emp1 = repo.findEmployeeBySalaryGreaterThan(5000.00);
		emp1.forEach(System.out::println);
		Iterable<Employees> emp2= repo.findEmployeeByNameContaining("s");
		emp2.forEach(System.out::println);
	}
	
	
}
