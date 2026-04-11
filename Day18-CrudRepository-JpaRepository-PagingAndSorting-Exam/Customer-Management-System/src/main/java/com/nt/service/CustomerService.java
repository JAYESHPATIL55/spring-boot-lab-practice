package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private CustomerRepository custRepo;
	@Override
	public void addAllCutomer(List<Customer> cst) {
		
	custRepo.saveAll(cst);
		System.out.println("Customer Added.");
	}

	@Override
	public Iterable<Customer> showAllCutomer() {
		
		return custRepo.findAll();
	}

}
