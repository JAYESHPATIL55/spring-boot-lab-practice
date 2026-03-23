package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Order;
import com.nt.service.OrderServiceImpl;
@Controller
public class OrderController {
	@Autowired
	private OrderServiceImpl orderService;
public void addOrder(Order order) {
	orderService.addOrder(order);
}
public List<Order> retrieveAllOrders(){
	
	return orderService.retrieveAllOrders();
}
public void deleteOrder(int bookId) {
	orderService.deleteOrder(bookId);
}
public void updateOrder(Order order) {
	orderService.updateOrder(order);
}
}
