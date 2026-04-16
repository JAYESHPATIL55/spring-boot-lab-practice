package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	//  JPQL (@Query)
	@Query("FROM Employee e WHERE e.department =:department")
	public Iterable<Employee> findEmployeeByDepartment(String department);

	@Query("FROM Employee e WHERE e.salary >= :salary")
	public Iterable<Employee> findEmployeeBySalaryGreaterThan(Double salary);

	@Query("FROM Employee e WHERE e.name=:str% ")
	public Iterable<Employee> findEmployeeByNameStartingWith(String str);
	
	@Query("FROM Employee e WHERE e.department = :department")
	public int findEmployeeCountByDepartment(String department);
	
	@Query("FROM Employee e WHERE e.department = :department AND e.designation = :designation")
	public Iterable<Employee> findEmployeeByDepartmentANDDesignation(String department, String designation);
	
//	Native Query
	@Modifying
    @Transactional
	@Query(value="UPDATE Employee e SET e.salary = :salary WHERE e.id = :id",nativeQuery=true)
	public int findEmployeeById(@Param("salary")Double salary,@Param("id")Long id);
	@Modifying
    @Transactional
	@Query(value="UPDATE Employee e SET e.salary = :salary WHERE e.department = :department",nativeQuery=true)
	public int findEmployeeByDepartment(Double salary,String deparment);
  
	@Modifying
    @Transactional
	@Query(value="DELETE FROM Employee WHERE department=:department",nativeQuery=true)
	public int deleteEmployeeByDepartment(String department);
	
}
