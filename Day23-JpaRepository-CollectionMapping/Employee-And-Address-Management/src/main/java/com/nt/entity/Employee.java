package com.nt.entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.SequenceGenerator;
//import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

	@Id
//	@SequenceGenerator(name = "emp_add", allocationSize = 100, initialValue = 1)
	private Long id;
	@NonNull
	private String name;
	@ElementCollection
	@CollectionTable(name = "employee_addresses", joinColumns = @JoinColumn(name = "employee_id", // FK column in
																									// address table
			referencedColumnName = "id" // PK column in Employee table
	))
	private List<Address> addresses;
}
