package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.main.*;
@SpringBootApplication
public class BankAccountValidationSystemApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext ctx = 	SpringApplication.run(BankAccountValidationSystemApplication.class, args);
		BankRunner bank = ctx.getBean(BankRunner.class);
		System.out.println("---- Bank Account Details  ----\n");
		Bank bankAcc = bank.getBanks();
            System.out.println( "Account No : " + bankAcc.getAccountNumber() +
                " | Name : " + bankAcc.getHolderName()+
                " | Balance : " +bankAcc.getBalance());
		
	}

	}

