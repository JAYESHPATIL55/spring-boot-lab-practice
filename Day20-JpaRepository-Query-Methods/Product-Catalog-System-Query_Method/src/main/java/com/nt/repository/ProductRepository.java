package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.model.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {
	
	@Query("FROM Products WHERE category = ?1")
	public List<Products>  showProductsByCategory(String category);
	
	@Query("FROM Products WHERE stock >= :stock")
	public List<Products> showProductsByStockGreaterThan(@Param("stock") Integer value);
	@Query("FROM Products WHERE name = ?1%")
	public List<Products> getProductsByNameContaining(String str);
}