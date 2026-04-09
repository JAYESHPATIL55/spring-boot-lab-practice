package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeeController;
@Component
public class EmployeeApplicationRunner implements CommandLineRunner{

	 @Autowired
	    private EmployeeController controller;

	    @Override
	    public void run(String... args) {

	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n===== Travel Booking System =====");
	            System.out.println("1. Add Travel");
	            System.out.println("4. Exit");

	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    controller.saveEmployees();
	                    break;
	        
	                case 4:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	
}