package com.nt.factory;

import org.springframework.stereotype.Component;

import com.nt.component.Vehicle;

@Component("truck")
public class Truck implements Vehicle {
	@Override
	public void assemble() {
		System.out.println("Assembling a Truck with heavy-duty engine");
	}
}
