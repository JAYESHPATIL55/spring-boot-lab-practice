package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.component.Appliance;

@Component
public class ApplianceFactory {
	
	@Autowired
	private Map<String, Appliance>  appliances;

	public Appliance getAppliance(String type) {
		Appliance appliance = appliances.get(type);

		if (appliance == null) {
			throw new IllegalArgumentException("Invalid appliance type: " + type);
		}

		return appliance;
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("WashingMachine", WashingMachine.class);
//		map.put("Refrigerator", Refrigerator.class);
//		return map;

	}
}