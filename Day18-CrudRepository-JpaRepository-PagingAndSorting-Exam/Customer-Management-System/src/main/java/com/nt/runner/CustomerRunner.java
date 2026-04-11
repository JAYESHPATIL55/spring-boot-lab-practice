package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.CustomerService;

@Component
public class CustomerRunner implements CommandLineRunner{

	@Autowired
	private CustomerService service;
	@Override
	public void run(String... args) throws Exception {

//		Scanner sc = new Scanner(System.in);
		
		service.addAllCutomer(Arrays.asList(new Customer(1,"kartiki","HYD",21),new Customer(2,"jayesh","MUM",22)));
		
		
		Iterable<Customer> it = service.showAllCutomer();
		it.forEach(System.out::println);
		
		
	}

}
