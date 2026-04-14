package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.model.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

	
	@Query("FROM Employee WHERE department = ?1")
	public List<Employee> showEmployeeByDepartment(String department);
	
	@Query("FROM Employee WHERE experience = :experience")
	public List<Employee> showEmployeeByExperience(Integer experience);

	@Query("FROM Employee WHERE salary >= :salary AND salary <= :values")
	public List<Employee> showEmployeeBySalaryBetweenRang(@Param("salary") Double value, Double values);

	@Query("FROM Employee WHERE name = ?1%")
	public List<Employee> getEmployeeByNameContaining(String str);
	
	@Query("FROM Employee e WHERE e.salary = (SELECT MAX(e2.salary) FROM Employee e2)")
	List<Employee> findHighestSalaryEmployee();
	
	@Modifying
	@Transactional
	@Query("UPDATE Employee e SET e.salary = e.salary + (e.salary  *  :percent / 100)")
	int  increaseSalaryByPercent(@Param("percent") Double percent);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Employee e WHERE e.salary = (SELECT MIN(e2.salary) FROM Employee e2)")
	List<Employee> deleteLowestSalaryEmployee();
	
	//SELECT id, name, department, salary, experience 
	@Query("FROM Employee")
	public List<Employee> showEmployee();
	
	@Query("SELECT id, name, department, salary, experience FROM Employee WHERE salary >= :salary")
	public List<Employee> getEmployeeBySalary(Double salary);
}