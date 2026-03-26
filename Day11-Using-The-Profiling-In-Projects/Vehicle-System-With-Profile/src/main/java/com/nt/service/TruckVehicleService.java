package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.nt.model.Vehicle;
@Component
@Profile("test")
public class TruckVehicleService implements VehicleService {

	

	@Override
	public void getVehicle() {
		Vehicle v1 =new Vehicle(1,"Tata","Truck");
		Vehicle v2 =new Vehicle(2,"Volvo","Truck");
		System.out.println("id : "+v1.getId()+" \nName:   "+v1.getName()+"\nType: "+v1.getType());
		System.out.println("id : "+v2.getId()+" \nName:   "+v2.getName()+"\nType: "+v2.getType());

	}

}
