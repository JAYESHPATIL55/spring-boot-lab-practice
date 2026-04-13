package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Order;


public interface OrderRepository extends JpaRepository<Order, Integer>{
List<Order>	findByCourse(String course);
List<Order> findByMarksGreaterThan(Double marks);
List<Order> findByMarksBetween(Double min, Double max);
List<Order> findByGrade(String grade);
List<Order>findByCity(String city);
List<Order> findByPassedTrue();
List<Order> findByNameStartingWith(String prefix);
List<Order> findByCourseAndPassed(String course, Boolean status);
List<Order> findTop3ByOrderByMarksDesc();
List<Order> findByCityNotIn(List<String> cities);
}