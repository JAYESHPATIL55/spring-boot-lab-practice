package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Department;
import com.nt.entity.Employee;

public interface DepartmentRepository extends JpaRepository<Department,Long>{

	

}
