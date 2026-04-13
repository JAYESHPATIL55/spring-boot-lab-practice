package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Order;
import com.nt.service.OrderService;
@Component
public class OrderRunner implements CommandLineRunner{
	@Autowired
	private OrderService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			Order s1 = new Order(1l, "Jayesh", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Order s2 = new Order(2l, "Om", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Order s3 = new Order(3l, "Kartik", "Java Full Stack", 85.20, "B", "Hyderabad", true);
			Order s4 = new Order(4l, "Sandesh", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Order s5 = new Order(5l, "Vesh", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Order s6 = new Order(6l, "Vinay", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Order s7 = new Order(7l, "Shreyash", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			
			service.getStudentByCities("hyd").forEach(System.out::println);
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
	
}