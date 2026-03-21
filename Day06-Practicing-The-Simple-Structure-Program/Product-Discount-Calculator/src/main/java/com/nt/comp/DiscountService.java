package com.nt.comp;

import java.util.Scanner;

import org.springframework.stereotype.Component;


@Component
public class DiscountService {
	public static double applyDiscount(double price, double discountPercentage ) {
		return (double) price-(price*(discountPercentage/100));
	}
}
