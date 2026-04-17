package com.nt.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
//@Table(name="employee_addresses")
@Embeddable
public class Address {
//	@Id
//	private Long id;
	@NonNull
	private String city;
	@NonNull
	private String state;
}
