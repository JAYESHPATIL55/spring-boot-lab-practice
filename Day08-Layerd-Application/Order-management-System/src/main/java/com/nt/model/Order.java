package com.nt.model;

import lombok.Data;

@Data
public class Order {
	private int  OrderId;
	private String date;
	private String customerName;
	private double totalAmount;
	
	
}