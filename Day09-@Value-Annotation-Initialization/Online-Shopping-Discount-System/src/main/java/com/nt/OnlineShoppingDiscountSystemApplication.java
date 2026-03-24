package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Ecommerce;

@SpringBootApplication
public class OnlineShoppingDiscountSystemApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ctx =	SpringApplication.run(OnlineShoppingDiscountSystemApplication.class, args);
		Ecommerce emps = ctx.getBean(Ecommerce.class);
		System.out.println(emps);
	}

}
