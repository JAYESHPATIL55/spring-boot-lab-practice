package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Department;
import com.nt.entity.Employee;

public interface IDepartmentService {
public void saveDepartment(Department department);
public Optional<Department> getEmployeeByDepartment(Long id);
public List<Employee> getEmployeeBySalaryGreaterThan(Double salary);
void saveEmployeeToDepartment(String name, List<Employee> employee);
}
