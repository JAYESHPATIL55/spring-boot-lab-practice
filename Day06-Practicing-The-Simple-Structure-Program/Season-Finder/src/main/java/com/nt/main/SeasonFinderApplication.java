package com.nt.main;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.SeasonService;

@SpringBootApplication
public class SeasonFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeasonFinderApplication.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month Number (1 - 12): ");
		int month = sc.nextInt();
		System.out.println(SeasonService.getSeason(month));
	}

}
