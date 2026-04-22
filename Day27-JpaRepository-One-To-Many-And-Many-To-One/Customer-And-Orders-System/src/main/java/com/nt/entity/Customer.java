package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Customer {
//	@SequenceGenerator(name = "gen1",sequenceName = "cno_seq",initialValue = 1,allocationSize = 1)
//@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
	@Id
private Long id;
@NonNull
private String name;
private String email;
//@OneToMany(targetEntity = Order.class,cascade=CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "customer" )
//@JoinColumn(name="ORDER_NO",referencedColumnName = "Id")
//private List<Order> orders;
@OneToMany(mappedBy = "customer",
cascade = CascadeType.ALL,
fetch = FetchType.LAZY)
private List<Order> orders;

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", orders=" + orders + "]";
}





}
