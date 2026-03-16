package com.nt.factory;

import org.springframework.stereotype.Component;

import com.nt.component.Appliance;
@Component("frig")
public class Refrigerator implements Appliance {
@Override
	public void manufacture() {
	System.out.println("Refrigerator with Inverter Technology");	
	}
}
