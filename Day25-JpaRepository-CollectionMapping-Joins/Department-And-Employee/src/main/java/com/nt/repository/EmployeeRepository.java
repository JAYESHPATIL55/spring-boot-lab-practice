package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Department;

public interface EmployeeRepository extends JpaRepository<Department,Long>{

	

}
