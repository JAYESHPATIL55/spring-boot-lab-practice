package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
//@Table(name="employee_addresses")
@Entity
public class Employee {
	@Id
	private Long id;
	@NonNull
	private String name;
//	@NonNull
//	private String state;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
