package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCT_CATALOG_TABLE")
public class Products {
	@Id
	private Long id;
	private String name;
	private String category;
	private Double price;
	private Integer stock;
	

}