package com.nt.controller;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Component
public class EmployeeController {
	 @Autowired
	    private IEmployeeService service;

	    private Scanner sc = new Scanner(System.in);

	    public void saveEmployees() {
	        System.out.print("Enter name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Designation Mode: ");
	        String designation = sc.nextLine();

	        System.out.print("Enter Price: ");
	        Double salary = sc.nextDouble();
	        sc.nextLine();

	        Employee t = new Employee();
	        t.setName(name);
	        t.setDepartment(designation);
	        t.setSalary(salary);

	        service.saveEmployees();;
	        System.out.println("Employee Added Successfully");
	    }

	   
}