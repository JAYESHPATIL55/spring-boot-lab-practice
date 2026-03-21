package com.nt.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.component.Vehicle;

@Component
public class VehicleFactory {
	
	@Autowired
	private Map<String, Vehicle>  vehicles;

	public Vehicle getVehicle(String type) {
		Vehicle vehicle = vehicles.get(type);

		if (vehicle == null) {
			throw new IllegalArgumentException("Invalid appliance type: " + type);
		}

		return vehicle;
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("WashingMachine", WashingMachine.class);
//		map.put("Refrigerator", Refrigerator.class);
//		return map;

	}
}