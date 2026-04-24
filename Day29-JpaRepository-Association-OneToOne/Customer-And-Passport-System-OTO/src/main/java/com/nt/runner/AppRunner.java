package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.entity.Passport;
import com.nt.service.ICustomerService;

@Component
public class AppRunner implements CommandLineRunner{
@Autowired
private ICustomerService service;

@Override
public void run(String... args) throws Exception {
	Passport pass = new Passport(10101787L,"India");
	Customer cust = new Customer();
	cust.setCustomerName("jayesh");
	cust.setNationality("Indian");
	cust.setPassport(pass);
	
service.addCustomerWithPassport(cust);
}


}
