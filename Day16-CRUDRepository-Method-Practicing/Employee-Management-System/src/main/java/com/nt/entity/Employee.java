package com.nt.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name= "EMPLOYEE_SYSTEM")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long empId;
	
	private String name;
	private String department;
	private Double salary;
	
}