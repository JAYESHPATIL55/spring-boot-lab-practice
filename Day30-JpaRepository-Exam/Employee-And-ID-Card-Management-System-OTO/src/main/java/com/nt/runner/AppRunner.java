package com.nt.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.entity.IDCard;
import com.nt.repository.EmployeeRepository;

@Component
public class AppRunner implements CommandLineRunner{
@Autowired
private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
			
		Employee emp = new Employee();
		emp.setEmployeeName("Jayesh");
		emp.setDepartment("SOftware");
		emp.setSalary(75000.00);
		emp.setId(1l);
		IDCard idc = new IDCard();
		idc.setId(1l);
		idc.setCardName("Identity-Card");
		idc.setCardType("Normal");
		idc.setAccessLevel("FUll");
		idc.setIssuedBy("Manger");
		emp.setCards(idc);
		repo.save(emp);
		
		Optional<Employee>list =repo.findById(1l);
		list.ifPresentOrElse(System.out::println, null);
			
	}
	
	
	
}
