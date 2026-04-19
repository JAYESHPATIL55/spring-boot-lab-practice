package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.repository.DepartmentRepository;
@Service
public class DepartmentService implements IDepartmentService{
@Autowired
private DepartmentRepository repo;
	@Override
	public void createDepartment(Department department) {
		 repo.save(department);
	}

	@Override
	public Optional<Department> getEmployeeDetails(Long id) {

		return repo.findById(id);
	}

	@Override
	public void addEmployees( Iterable<Employee> employee) {
//		repo.saveAllAndFlush(employee);
		
	}

}
