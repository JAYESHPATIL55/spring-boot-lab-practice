package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Product;

@SpringBootApplication
public class ProductPriceConfigValueApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ctx =	SpringApplication.run(ProductPriceConfigValueApplication.class, args);
	Product product = ctx.getBean(Product.class);
	System.out.println(product);
	}

}
