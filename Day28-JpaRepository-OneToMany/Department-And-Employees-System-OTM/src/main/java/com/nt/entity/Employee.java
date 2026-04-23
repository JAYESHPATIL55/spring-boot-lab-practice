package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long eId;
	@NonNull
	private String name;
	@NonNull
	private Double salary;
	@NonNull
	private String designation;
	@NonNull
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private Department department;
	@Override
	public String toString() {
		return "Employee [id=" + eId + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
}
