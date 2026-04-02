package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.main.ProductRunner;

@SpringBootApplication
public class ProductInventorySystemApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(ProductInventorySystemApplication.class, args);
		ProductRunner prod = ctx.getBean(ProductRunner.class);
		System.out.println("Id: "+prod.getId());
		System.out.println("Name:  "+prod.getName());
		System.out.println("Course: "+prod.getPrice());
		System.out.println("Hobbies: "+prod.getFeatures());
		System.out.println("Subjects: "+prod.getCategories());
		System.out.println("Certification: "+prod.getTags());
		System.out.println("Marks: "+prod.getStock());
		System.out.println("Address: "+prod.getSupplier());
	}
}
