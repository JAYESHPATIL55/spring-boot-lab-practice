package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
	@Id
	private Long id;
	@NonNull
	private String employeeName;
	@NonNull
	private String department;
	@NonNull
	private Double salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "IDCard_id")
	private IDCard cards;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", department=" + department + ", salary="
				+ salary + ", cards=" + cards + "]";
	}
	
	
}
