package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EMPLOYEE_ANALYTICS")
public class Employee {

	@Id
	private Long id;
	private String name;
	private String department;
	private double salary;
	private String designation;
}
