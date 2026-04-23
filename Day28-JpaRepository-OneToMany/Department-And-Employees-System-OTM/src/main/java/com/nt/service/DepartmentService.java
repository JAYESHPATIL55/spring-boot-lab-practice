
package com.nt.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.repository.DepartmentRepository;
import com.nt.repository.EmployeeRepository;
@Service
public class DepartmentService implements IDepartmentService {
@Autowired
private DepartmentRepository deptRepo;
@Autowired
private EmployeeRepository empRepo;
	
	@Override
	public void saveDepartment(Department department) {
		
		deptRepo.save(department);
	}

	@Override
	public void saveEmployeeToDepartment(String name, List<Employee> employee) {
		
		Department dept = deptRepo.findDepartmentByName(name);
		employee.stream().forEach(emp -> emp.setDepartment(dept));;
//		for(Employee emp :employee) {
//			emp.setDepartment(dept);
//		}
		dept.getEmployees().addAll(employee);
		deptRepo.save(dept);
		
	}
	public Department getDepartmentByName(String name) {
		return deptRepo.findDepartmentByName(name);
	}
	
	@Override
	public Optional<Department> getEmployeeByDepartment(Long id) {
	
		return deptRepo.findById(id);
	}
	
	@Override
	public List<Employee> getEmployeeBySalaryGreaterThan(Double salary) {
	
		return  empRepo.findEmployeeBySalaryGreaterThan(salary);
	}

}
