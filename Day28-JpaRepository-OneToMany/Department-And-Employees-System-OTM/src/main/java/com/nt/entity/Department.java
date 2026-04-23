package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Department {
	@Id
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String location;
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Employee> employees;
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + ", employees=" + employees + "]";
	}
	
	

}
