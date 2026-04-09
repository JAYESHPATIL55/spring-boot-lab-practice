package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.entity.Employee;

public interface IEmployeeService {

	void saveEmployees();
	Iterable<Employee> getEmployeesByPageAndSort();

}