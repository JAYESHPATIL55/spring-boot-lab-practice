package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;

public interface ICustomerService {

	
	
	public void addAllCutomer(List<Customer> cst);
	public Iterable<Customer> showAllCutomer();
}
