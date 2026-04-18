package com.nt.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.reposiotry.IEmployeeRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("Python");
		set.add("Mysql");
		set.add("Oracle");
	repo.save(new Employee(9l,"Shiv",set));
	Iterable<Employee> emp =repo.findAll();
	emp.forEach(System.out::println);
		
	}
	
	
}
