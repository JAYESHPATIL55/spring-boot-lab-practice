package com.nt.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Employees;

public interface IEmployeeRepository extends JpaRepository<Employees, Long> {

	@Query("FROM Employees WHERE department= ?1")
	public Iterable<Employees> findEmployeeByDepartment(String department);

	@Query("FROM Employees WHERE salary >= ?1")
	public Iterable<Employees> findEmployeeBySalaryGreaterThan(Double salary);

	@Query("FROM Employees WHERE name = ?1%")
	public Iterable<Employees> findEmployeeByNameContaining(String name);
}
