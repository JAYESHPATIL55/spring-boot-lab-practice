package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.entity.Skill;
import com.nt.repository.EmployeeRepository;
import com.nt.repository.SkillRepository;
import java.util.List;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository erepo;
	@Autowired
	private SkillRepository srepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Save Operation");
		Employee emp1 = new Employee();
		emp1.setId(103l);
		emp1.setName("vesh");
		Employee emp2 = new Employee();
		emp2.setId(104l);
		emp2.setName("shreyash");
		Skill s1 = new Skill();
		s1.setId(1l);
		s1.setName("Full Stack");
		Skill s2 = new Skill();
		s2.setId(2l);
		s2.setName("Data Science");
		Skill s3 = new Skill();
		s3.setId(3l);
		s3.setName("Software Development");
		Skill s4 = new Skill();
		s4.setId(4l);
		s4.setName("Ai Engineer");
		s1.setEmployees(Arrays.asList(emp1));
		s2.setEmployees(Arrays.asList(emp1));
		s3.setEmployees(Arrays.asList(emp2));
		s4.setEmployees(Arrays.asList(emp2));
//		srepo.save(s1);
//		srepo.save(s2);
//		srepo.save(s3);
//		srepo.save(s4);
		emp1.setSkills(Arrays.asList(s1,s2));
		emp2.setSkills(Arrays.asList(s3,s4));
		
		
		erepo.save(emp1);
		erepo.save(emp2);
		System.out.println("All Save");
		System.out.println("\nFind All");
		
		
		List<Employee> em = erepo.findAll();
		em.forEach(System.out::println);
		System.out.println("\nFind All Done");
		System.out.println("\nDelete The Emp");
	erepo.deleteById(102l);
		
		
	}

}
