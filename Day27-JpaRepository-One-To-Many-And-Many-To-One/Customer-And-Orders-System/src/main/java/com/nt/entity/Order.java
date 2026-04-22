package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name="cust_Order")
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long oId;
	@NonNull
	private String ProductName;
	@NonNull
	private Double price;
//	@ManyToOne(targetEntity = Customer.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name="ORDER_NO",referencedColumnName = "id")
//	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "id")
	private Customer customer;
	@Override
	public String toString() {
		return "Order [id=" + oId + ", ProductName=" + ProductName + ", price=" + price + ", customer=" + customer + "]";
	}
	
	
}
