package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private Integer Id;
	private String name;
	private String course;
	private  String college;
	private Double[] marks;
	
	
}
