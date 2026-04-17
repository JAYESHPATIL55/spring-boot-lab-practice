package com.nt.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Component
public class AppRunners implements CommandLineRunner {

	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {

		
//		Employee s1 = new Employee(1l, "Jayesh",
//				Arrays.asList(new Address("Hyderabad","Telangana")));
//		Employee s2 = new Employee(2l, "Vesh",
//				Arrays.asList(new Address("Bengeluru","Karnataka")));
//		Employee s3 = new Employee(3l, "Shreyash",
//				Arrays.asList(new Address("Pune","Maharashtra")));
//		Employee s4 = new Employee(4l, "Vinay",
//				Arrays.asList(new Address("Chennai","Tamil Nadu")));
//	service.saveEmployee(s2);
//		service.saveEmployee(s4);
//		service.saveEmployee(s3);
		
		Optional<Employee> optional = service.getEmployeeDetails(2l);
		System.out.println(optional);
//		optional.forEach(System.out::println);
		if (!optional.isEmpty()) {
			System.out.println("Id: "+optional.get().getId());
			System.out.println("Name: "+optional.get().getName());
			optional.get().getAddresses().forEach(System.out::println);
			
		}
//		service.getEmployeeDetails(1l);
	}

}
