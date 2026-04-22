package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.entity.Order;
import com.nt.repository.CustomerRepository;
@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private CustomerRepository repo;
	@Override
	public void run(String... args) throws Exception {
		Customer cust1 = new Customer(6l,"ram","ram@gmail.com",Arrays.asList(new Order("Kheer",1560.00),new Order("jalebi",234.00)));
		Customer cust2 = new Customer(7l,"ganesh","ganesh@gmail.com",Arrays.asList(new Order("laddoo",278.00),new Order("modak",783.00)));
		Customer cust3 = new Customer(8l,"shiv","shiv@gmail.com",Arrays.asList(new Order("bael",782.00),new Order("kandamool",456.00)));
		Customer cust4 = new Customer(9l,"krishna","krishna@gmail.com",Arrays.asList(new Order("makhan",1829.00),new Order("fruit",900.00)));
		Customer cust5 = new Customer(10l,"balram","balram@gmail.com",Arrays.asList(new Order("makhan",9182.00),new Order("laddoo",289.00)));
		repo.saveAll(Arrays.asList(cust1,cust2,cust3,cust4,cust5));
	}

}
