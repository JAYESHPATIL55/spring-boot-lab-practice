package com.nt.main;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Student {
	private Integer id;
	private String name;
	private Double marks;
}
