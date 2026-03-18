package com.nt.main;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Bank {
	private Long accountNumber;
	private String holderName;
	private Double balance;
}
