package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {
	private int id;
	private String name;
	private String type;
}