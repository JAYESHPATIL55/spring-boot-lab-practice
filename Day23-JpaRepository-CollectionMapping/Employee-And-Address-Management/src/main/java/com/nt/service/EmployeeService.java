package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.EmployeeRepository;
@Service
public class EmployeeService implements IEmployeeService{
@Autowired
private EmployeeRepository repo;
	@Override
	public void saveEmployee(Employee employee) {
		 repo.save(employee);
	}

	@Override
	public Optional<Employee> getEmployeeDetails(Long id) {

		return repo.findById(id);
	}

}
