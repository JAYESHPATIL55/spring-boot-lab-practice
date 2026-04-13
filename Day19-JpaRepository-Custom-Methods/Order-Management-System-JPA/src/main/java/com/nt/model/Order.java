package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="STUDENT_MANAGEMENT")
public class Order {
	@Id
	private  Long id;
	private String name;
	private String course;
	private Double marks;
	private String grade;
	private String city;
	private Boolean passed;
}