package com.nt.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Skill {

	@Id
	private Long id;
	private String name;
	@ManyToMany(mappedBy = "skills",fetch = FetchType.EAGER)
	List<Employee> employees;
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}
	
}
