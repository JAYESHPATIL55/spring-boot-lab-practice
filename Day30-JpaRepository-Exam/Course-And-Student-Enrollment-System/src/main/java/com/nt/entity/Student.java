package com.nt.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
	@Id
	private Long id;
	@NonNull
	private String studentName;
	private String email;
	private String grade;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Student_id")
	private Course courses;

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", email=" + email + ", grade=" + grade
				+  "]";
	}
	
	
	
	
	

}
