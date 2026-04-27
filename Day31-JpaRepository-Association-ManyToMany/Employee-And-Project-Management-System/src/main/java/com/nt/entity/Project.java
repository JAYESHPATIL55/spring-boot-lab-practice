package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class Project {
	
	@Id
	private Long projectId;
	@NonNull
	private String projectName;
	@NonNull
	private String clientName;
	@ManyToMany(mappedBy ="projects",cascade = CascadeType.ALL)
	private List<Employee> employees;
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", clientName=" + clientName
				+  "]";
	}
	

}
