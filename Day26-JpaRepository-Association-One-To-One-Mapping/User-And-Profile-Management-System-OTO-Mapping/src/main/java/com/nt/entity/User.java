package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@RequiredArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String email;
	@OneToOne(targetEntity = Profile.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	@JoinColumn(name = "id")
	private Profile profile;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", profile=" + profile + "]";
	}
	
	
	

}
