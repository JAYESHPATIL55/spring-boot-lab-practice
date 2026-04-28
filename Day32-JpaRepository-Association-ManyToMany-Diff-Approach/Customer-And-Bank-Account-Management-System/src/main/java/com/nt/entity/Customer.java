package com.nt.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Customer {

	@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	private String customerName;
	private String city;
	@ManyToMany(targetEntity = BankAccount.class,cascade = CascadeType.ALL)
	@JoinTable(name="BankAccounts" ,
						joinColumns = @JoinColumn(name="customerId"),
						inverseJoinColumns = @JoinColumn(name= "accountId")
			)
	private Set<BankAccount> accounts;
	
	
}
