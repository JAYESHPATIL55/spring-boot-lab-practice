package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_SEARCH_TABLE")
public class Employee {
	@Id
	private Long id;
	private String name;
	private String department;
	private Double salary;
	private String joiningDate;
	

}