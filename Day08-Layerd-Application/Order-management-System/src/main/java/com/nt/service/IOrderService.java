package com.nt.service;

import java.util.List;

import com.nt.model.Order;

public interface IOrderService {
public void addOrder(Order order);
public List<Order> retrieveAllOrders();
public void deleteOrder(int bookId);
public void updateOrder(Order order);
}
