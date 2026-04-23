package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Department;
import com.nt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	public Department findEmployeeByDepartment(String department);
	public List<Employee> findEmployeeBySalaryGreaterThan(Double salary);
}
