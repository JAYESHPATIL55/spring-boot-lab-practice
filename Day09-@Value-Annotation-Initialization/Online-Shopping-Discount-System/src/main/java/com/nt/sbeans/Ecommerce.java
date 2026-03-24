package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Ecommerce {
	@Value("${prod.productName}")
	private String productName;
	@Value("${prod.productPrice}")
	private Double productPrice;
	@Value("${prod.discountPercentage}")
	private Double discountPercentage;
	@Value("#{${prod.productPrice} * ${prod.discountPercentage} / 100}")
	private Double FinalDiscount;
	@Value("#{${prod.productPrice} * ${prod.discountPercentage} / 100  - ${prod.productPrice}}")
	private Double totalPrice;
	
	@Override
	public String toString() {
		return "Ecommerce [productName = " + productName + ", \nproductPrice = " + productPrice + ", \ndiscountPercentage = "
				+ discountPercentage + ", \nFinalDiscount = " + FinalDiscount + ", \nTotalPriceToPay = " +totalPrice+"]";
	}

	

}