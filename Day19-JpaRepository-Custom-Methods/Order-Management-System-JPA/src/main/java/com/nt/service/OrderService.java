package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Order;
import com.nt.repository.OrderRepository;
@Service
public class OrderService  implements IOrderService{
		
	@Autowired
	private OrderRepository repository;
	
	@Override
	public List<Order> getTopScorers() {
		return repository.findTop3ByOrderByMarksDesc();
	}

	@Override
	public List<Order> filterStudentsWhoPassed() {
		return repository.findByPassedTrue();
		
	}

	@Override
	public List<Order> getByName(String name) {
		return repository.findByNameStartingWith(name);
	}

	@Override
	public List<Order> getStudentByCities(String city) {
		return repository.findByCity(city);
	}
	
	
}