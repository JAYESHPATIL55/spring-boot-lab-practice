package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.model.Vehicle;
import com.nt.service.VehicleService;

@SpringBootApplication
public class VehicleSystemWithProfileApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VehicleSystemWithProfileApplication.class, args);
	}

	@Autowired
	private VehicleService vehicleService;

	@Override
	public void run(String... args) throws Exception {
		vehicleService.getVehicle();
	}

}
