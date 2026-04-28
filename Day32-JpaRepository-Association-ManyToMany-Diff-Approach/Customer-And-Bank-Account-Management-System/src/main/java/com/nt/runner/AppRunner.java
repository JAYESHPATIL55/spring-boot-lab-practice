package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankAccount;
import com.nt.entity.Customer;
import com.nt.repository.BankAccountRepository;
import com.nt.repository.CustomerRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private CustomerRepository repo;
	@Autowired
	private BankAccountRepository brepo;

	@Override
	public void run(String... args) throws Exception {
		Customer cust1 = new Customer();
		cust1.setCustomerId(1l);
		cust1.setCustomerName("Jayesh");
		cust1.setCity("Jalgaon");
		Customer cust2 = new Customer();
		cust2.setCustomerId(2l);
		cust2.setCustomerName("Vijay");
		cust2.setCity("Dhule");

		BankAccount ba1 = new BankAccount();
		//ba1.setAccountId(10001l);
		ba1.setAccountType("Saving");
		ba1.setBalance(567890.00);
		BankAccount ba2 = new BankAccount();
		// ba2.setAccountId(10002l);
		ba2.setAccountType("Current");
		ba2.setBalance(56000.00);
		BankAccount ba3 = new BankAccount();
		// ba3.setAccountId(10003l);
		ba3.setAccountType("Saving");
		ba3.setBalance(76009.00);
		BankAccount ba4 = new BankAccount();
		// ba4.setAccountId(10004l);
		ba4.setAccountType("Saving");
		ba4.setBalance(46270.00);

		//brepo.save(ba1);
		// repo.saveAll(Arrays.asList(cust1,cust2));

	}

}
