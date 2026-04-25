package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	public List<Employee> findEmployeeById(Long id);
}
