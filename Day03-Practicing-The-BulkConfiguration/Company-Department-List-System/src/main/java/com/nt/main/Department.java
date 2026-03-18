package com.nt.main;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Department {
	private Integer deptId;
	private String deptName;
}
