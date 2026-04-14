package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner{

	@Autowired
	private ProductRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
	
		repository.showProductsByStockGreaterThan(0);
		repository.showProductsByCategory("ELECTRONIC");
		repository.getProductsByNameContaining("A");
	}
	
}