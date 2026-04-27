package com.nt.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.entity.Project;
import com.nt.repository.EmployeeRepository;
@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public void run(String... args) throws Exception {
		Project p1=new Project();
		p1.setProjectId(101l);
		p1.setProjectName("Banking Application");p1.setClientName("HDFC");
		

			Project p2=new Project();
			p2.setProjectId(102l);
			p1.setProjectName("Ecommerce Platform");p1.setClientName("Amazon");


			Employee e1 = new Employee();
			e1.setEmpId(1000l);
			e1.setEmpName("Rahman");e1.setDepartment("Java");
			
			Employee e2 = new Employee();
			e2.setEmpId(1001l);
				e2.setEmpName("Kiran");
				e2.setDepartment("Testing");

			e1.setProjects(Arrays.asList(p1,p2));

			e2.setProjects(Arrays.asList(p2));
			p1.setEmployees(Arrays.asList(e1));
			p2.setEmployees(Arrays.asList(e2));


			empRepo.save(e1);
			empRepo.save(e2);
			Optional<Employee> emp = empRepo.findById(101l);
			emp.ifPresent(System.out::println);

	}

}
