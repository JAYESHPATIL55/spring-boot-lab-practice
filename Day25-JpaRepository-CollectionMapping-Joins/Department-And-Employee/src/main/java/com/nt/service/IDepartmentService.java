package com.nt.service;

import java.util.Optional;

import com.nt.entity.Department;
import com.nt.entity.Employee;

public interface IDepartmentService {
	public void addEmployees(Iterable<Employee> employee);
	public void createDepartment(Department department);
	public Optional<Department> getEmployeeDetails(Long id);
}
