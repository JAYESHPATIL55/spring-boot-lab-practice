package com.nt.main;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.DiscountService;

@SpringBootApplication
public class ProductDiscountCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDiscountCalculatorApplication.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Price Of Product:  ");
		double price = sc.nextDouble();
		System.out.print("Enter The Discount Percentage On Order : ");
		double discountPercentage = sc.nextDouble();
		System.out.println(
				"TheTotal Price of Product is: " + price +
				"\n The Discount Percentage is: " + discountPercentage +
			    "\nTotal After Discount: " + DiscountService.applyDiscount(price, discountPercentage));
	}

}
