package com.nt.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Iterable<Employee> findEmployeeByDepartment(String dept);

	Optional<Employee> findBySalaryGreaterThan(Double salary);

	List<Employee> findEmployeeByJoiningDate(LocalDate date);

	List<Employee> findByNameStartingWith(String firstChar);
}