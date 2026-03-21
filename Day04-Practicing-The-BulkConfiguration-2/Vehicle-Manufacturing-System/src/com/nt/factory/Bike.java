package com.nt.factory;

import org.springframework.stereotype.Component;

import com.nt.component.Vehicle;

@Component("bike")
public class Bike implements Vehicle {
	@Override
	public void assemble() {
		System.out.println("Assembling a Bike with lightweight alloy frame");
	}
}
