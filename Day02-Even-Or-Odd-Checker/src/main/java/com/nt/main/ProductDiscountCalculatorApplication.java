package com.nt.main;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.NumberService;

@SpringBootApplication
public class ProductDiscountCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDiscountCalculatorApplication.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Price Of Product:  ");
		int number = sc.nextInt();
		System.out.println(
				"The Enter Number is: " + number +
			    "\nEntered Number Is: " + NumberService.checkEvenOdd(number));
	}

}
