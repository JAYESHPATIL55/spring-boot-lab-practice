package com.nt.factory;

import org.springframework.stereotype.Component;

import com.nt.component.Appliance;
@Component("wash")
public class WashingMachine implements Appliance {
@Override
	public void manufacture() {
		System.out.println("Washing Machine with smart sensores");
	}
}
