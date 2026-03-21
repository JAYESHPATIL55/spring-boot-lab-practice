package com.nt.factory;

import org.springframework.stereotype.Component;

import com.nt.component.Vehicle;

@Component("car")
public class Car implements Vehicle {
	@Override
	public void assemble() {
		System.out.println("Assembling a Car with automatic transmission");
	}
}
