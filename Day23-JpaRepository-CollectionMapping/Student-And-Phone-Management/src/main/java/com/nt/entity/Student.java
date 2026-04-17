package com.nt.entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {
	
	@Id
	private Long id;
	@NonNull
	private String name;
	@ElementCollection
	@CollectionTable(name= "student_phones", joinColumns = @JoinColumn( name= "student_id"))
	private List<String> phoneNumbers;
}

