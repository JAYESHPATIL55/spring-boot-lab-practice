package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	private Long empId;
	@NonNull
	private String empName;
	@NonNull
	private String department;
	
	@ManyToMany(targetEntity = Project.class,cascade = CascadeType.ALL)
	@JoinTable(
		    name="emp_project_map",
		    joinColumns = @JoinColumn(name="employee_id"),
		    inverseJoinColumns = @JoinColumn(name ="project_id")
		)
	private List<Project> projects;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + "]";
	}
	
	
	

}
