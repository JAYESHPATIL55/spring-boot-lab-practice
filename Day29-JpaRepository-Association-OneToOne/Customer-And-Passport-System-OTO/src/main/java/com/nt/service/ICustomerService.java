package com.nt.service;

import java.util.Optional;

import com.nt.entity.Customer;
import com.nt.entity.Passport;

public interface ICustomerService {
	public void addCustomerWithPassport(Customer customer);
	public Optional<Customer> getCustomerDetails(Long Name);
	public void updatePassport(Customer passport);
	public void deleteCustomer(String name);
}
