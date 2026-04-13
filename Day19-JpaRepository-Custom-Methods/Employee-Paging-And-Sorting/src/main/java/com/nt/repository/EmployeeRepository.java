package com.nt.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>, 
												CrudRepository<Employee, Integer> {
}