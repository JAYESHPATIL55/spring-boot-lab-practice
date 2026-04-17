package com.nt.service;

import java.util.Optional;

import com.nt.entity.Employee;

public interface IEmployeeService {

	public void saveEmployee(Employee employee);
	public Optional<Employee> getEmployeeDetails(Long id);
}
