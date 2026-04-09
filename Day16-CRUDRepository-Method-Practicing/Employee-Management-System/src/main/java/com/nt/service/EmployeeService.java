package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nt.controller.EmployeeController;
import com.nt.entity.Employee;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
    private final EmployeeController employeeController;
	@Autowired
	private EmployeeRepository employeeRepository;

	private PageRequest pageRequest;

    EmployeeService(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

	public void saveEmployees() {
		employeeController.saveEmployees();
	}

	@Override
	public Iterable<Employee> getEmployeesByPageAndSort() {
		Page<Employee> page = employeeRepository.findAll(pageRequest);
		return page;
	}

}
