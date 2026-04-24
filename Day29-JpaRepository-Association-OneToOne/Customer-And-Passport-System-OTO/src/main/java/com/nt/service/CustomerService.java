package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.entity.Passport;
import com.nt.repository.CustomerRepository;
import com.nt.repository.PassportRepository;
@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private CustomerRepository cRepo;
	
	@Autowired
	private PassportRepository pRepo;
	
	@Override
	public void addCustomerWithPassport(Customer customer) {
		Passport save = pRepo.save(customer.getPassport());
		customer.setPassport(save);
		cRepo.save(customer);
		
	}

	@Override
	public Optional<Customer> getCustomerDetails(Long id) {

		return cRepo.findById(id);
	}

	@Override
	public void updatePassport(Customer passport) {
		
		cRepo.save(passport);
	}

	@Override
	public void deleteCustomer(String name) {
Customer c = cRepo.findCustomerByCustomerName(name);
		 cRepo.delete(c); ;
	}

}
