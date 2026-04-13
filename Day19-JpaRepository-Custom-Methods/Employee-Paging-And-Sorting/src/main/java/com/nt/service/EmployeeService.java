package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public void getEmployeesByPageAndSort(int pageSize) {

		long count = repository.count();
		long pagesCount = count / pageSize;

		if (count % pagesCount != 0) {
			pagesCount++;
		}
		for (int i = 0; i < pagesCount; i++) {
			Pageable pageable = PageRequest.of(i, pageSize);
			Page<Employee> page = repository.findAll(pageable);
			System.out.println("Page: " + (page.getNumber() + 1) + " Records of " + page.getTotalPages());
			page.getContent().forEach(System.out::println);
			System.out.println("----------------------------------");
		}
	}

	@Override
	public Page<Employee> showEmployeeInfoByPageNo(int pageNo, int pageSize, boolean ascOrder, String props) {

		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, props);

		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

		Page<Employee> page = repository.findAll(pageable);
		return page;

	}
}
