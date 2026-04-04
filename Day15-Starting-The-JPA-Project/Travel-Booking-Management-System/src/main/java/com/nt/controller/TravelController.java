package com.nt.controller;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Travel;
import com.nt.service.ITravelService;

@Component
public class TravelController {
	 @Autowired
	    private ITravelService service;

	    private Scanner sc = new Scanner(System.in);

	    public void addTravel() {
	        System.out.print("Enter Destination: ");
	        String dest = sc.nextLine();

	        System.out.print("Enter Transportation Mode: ");
	        String mode = sc.nextLine();

	        System.out.print("Enter Price: ");
	        Double price = sc.nextDouble();
	        sc.nextLine();

	        Travel t = new Travel();
	        t.setDestination(dest);
	        t.setTransportationMode(mode);
	        t.setPrice(price);

	        service.addTravel(t);
	        System.out.println("Travel Added Successfully");
	    }

	    public void retrieveAllTravels() {
	        Iterable<Travel> list = service.getAllTravels();

	        list.forEach(t -> {
	            System.out.println("-------------------");
	            System.out.println("ID: " + t.getId());
	            System.out.println("Destination: " + t.getDestination());
	            System.out.println("Mode: " + t.getTransportationMode());
	            System.out.println("Price: " + t.getPrice());
	        });
	    }

	    public void findTravelById() {
	        System.out.print("Enter ID: ");
	        Long id = sc.nextLong();

	        Optional<Travel> opt = service.findAllTravels(id);

	        if (opt.isPresent()) {
	            Travel t = opt.get();
	            System.out.println("Destination: " + t.getDestination());
	            System.out.println("Mode: " + t.getTransportationMode());
	            System.out.println("Price: " + t.getPrice());
	        } else {
	            System.out.println(" Travel Not Found");
	        }
	    }
}