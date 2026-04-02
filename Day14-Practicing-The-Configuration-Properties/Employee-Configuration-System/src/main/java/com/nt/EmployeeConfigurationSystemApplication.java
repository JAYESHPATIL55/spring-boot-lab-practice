package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.main.EmployeeRunner;

@SpringBootApplication
public class EmployeeConfigurationSystemApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(EmployeeConfigurationSystemApplication.class, args);
		EmployeeRunner emp = ctx.getBean(EmployeeRunner.class);
		System.out.println("Id: "+emp.getId());
		System.out.println("Name:  "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Skills: "+emp.getSkills());
		System.out.println("Projects: "+emp.getProjects());
		System.out.println("Tools: "+emp.getTools());
		System.out.println("Experience: "+emp.getExperience());
		System.out.println("Address: "+emp.getAddress());
	}
}
