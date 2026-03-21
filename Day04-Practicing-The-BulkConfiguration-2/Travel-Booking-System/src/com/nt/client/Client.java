package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.LoanService;

public class Client {

	public static void main(String[] args) {
	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	 
	 LoanService loan = ctx.getBean("loan",LoanService.class);
	loan.processLoan(50000.00);
	 ctx.close();
	}
}
