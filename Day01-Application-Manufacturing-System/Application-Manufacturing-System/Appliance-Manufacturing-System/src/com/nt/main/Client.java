package com.nt.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.component.Appliance;
import com.nt.config.AppConfig;
import java.util.Scanner;
import com.nt.factory.*;

public class Client {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ApplianceFactory factory = context.getBean(ApplianceFactory.class);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter appliance type (wash / frig): ");
        String type = sc.nextLine();
        
        
        Appliance appliance = factory.getAppliance(type.toLowerCase());

        appliance.manufacture();

        context.close();
        sc.close();
	}
}
