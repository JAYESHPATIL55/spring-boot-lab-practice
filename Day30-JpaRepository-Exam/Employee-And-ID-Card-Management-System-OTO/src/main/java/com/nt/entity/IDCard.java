package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class IDCard {
	@Id
	private Long id;
	@NonNull
	private String cardName;
	private String cardType;
	private String accessLevel;
	private String issuedBy;
	@Override
	public String toString() {
		return "IDCard [id=" + id + ", cardName=" + cardName + ", cardType=" + cardType + ", accessLevel=" + accessLevel
				+ ", issuedBy=" + issuedBy + "]";
	}
	
	
	
	

}
