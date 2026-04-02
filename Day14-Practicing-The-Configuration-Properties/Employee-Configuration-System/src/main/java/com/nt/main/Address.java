package com.nt.main;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Address {
	private String city;
	private String state;
	private int pincode;
}
