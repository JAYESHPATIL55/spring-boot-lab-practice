package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.model.Employee;

public interface IEmployeeService {

	Page<Employee> showEmployeeInfoByPageNo(int pageNo, int pageSize, boolean ascOrder, String props);

	public void getEmployeesByPageAndSort(int pageSize);

}