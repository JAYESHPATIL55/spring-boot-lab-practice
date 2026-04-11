package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "PATIENT_CRUD")
public class Patient {

	@Id
	private Integer id;

	private String name;

	private String disease;

	private Integer age;

}
