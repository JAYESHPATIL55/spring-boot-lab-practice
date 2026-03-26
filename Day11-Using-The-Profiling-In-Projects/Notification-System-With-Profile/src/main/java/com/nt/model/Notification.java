package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notification {
	private int id;
	private String message;
	private String recipient;
}