package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Product {
@Value("${product.name}")
	private String name;
@Value("${product.price}")
	private double price;
	@Value("${product.discount}")
	private double discount;
	@Value("#{${product.price}  * ${product.discount}}")
	private Double yearSalary;

	

}