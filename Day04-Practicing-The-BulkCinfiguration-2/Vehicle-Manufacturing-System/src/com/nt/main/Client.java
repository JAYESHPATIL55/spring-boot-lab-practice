package com.nt.main;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.component.Vehicle;
import com.nt.config.AppConfig;
import com.nt.factory.VehicleFactory;

public class Client {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        VehicleFactory factory = context.getBean(VehicleFactory.class);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter appliance type (car/ bike / truck): ");
        String type = sc.nextLine();
        
        
        Vehicle vehicle = factory.getVehicle(type.toLowerCase());

        vehicle.assemble();

        context.close();
        sc.close();
	}
}
