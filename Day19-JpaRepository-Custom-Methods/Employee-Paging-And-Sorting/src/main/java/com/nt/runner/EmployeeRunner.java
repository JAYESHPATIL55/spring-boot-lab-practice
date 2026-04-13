package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner{

	@Autowired
	private EmployeeService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			service.getEmployeesByPageAndSort(2);
			System.out.println("---------------------------");
			
			Page<Employee> page = service.showEmployeeInfoByPageNo(2, 3, true, "name");
			System.out.println("Paga Number: "+page.getNumber()+
											"\nPages Count: "+page.getTotalPages()+
											"\nIs First Page: "+page.isFirst()+
											"\nIs Last Page: "+page.isLast()+
											"\nPage Size: "+page.getSize()+
											"\nPage Elements Count: "+page.getNumberOfElements());
					if(!page.isEmpty()) {
						List<Employee> list = page.getContent();
						list.forEach(System.out::println);
					}
					else {
						System.out.println("No Page Found");
					}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}