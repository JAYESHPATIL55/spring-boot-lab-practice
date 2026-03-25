package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public void addProduct(Employee employee) {
        employeeService.addEmployee(employee);
    }

    public List<Employee> retrieveAllEmployee() {
        return employeeService.retrieveAllEmployee();
    }

    public void deleteEmployee(int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

}