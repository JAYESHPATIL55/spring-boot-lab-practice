package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDAO;
import com.nt.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public void addEmployee(Employee employee) {
        employeeDAO.insertEmployee(employee);
    }

    public List<Employee> retrieveAllEmployee() {
        return employeeDAO.getAllEmployee();
    }

    public void deleteEmployee(int employeeId) {
        employeeDAO.deleteEmployee(employeeId);
    }

}