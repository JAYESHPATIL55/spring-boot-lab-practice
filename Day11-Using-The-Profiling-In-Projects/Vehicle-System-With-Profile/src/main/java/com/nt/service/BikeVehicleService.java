package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.nt.model.Vehicle;
@Component
@Profile("dev")
public class BikeVehicleService implements VehicleService {


	@Override
	public void getVehicle() {
		Vehicle v1 =new Vehicle(1,"BMW S1000rr","Bike");
		Vehicle v2 =new Vehicle(2,"Kawasaki Ninja ZX10r","Bike");
		System.out.println("id : "+v1.getId()+" \nName:   "+v1.getName()+"\nType: "+v1.getType());
		System.out.println("id : "+v2.getId()+" \nName:   "+v2.getName()+"\nType: "+v2.getType());
		
		
	}

}
