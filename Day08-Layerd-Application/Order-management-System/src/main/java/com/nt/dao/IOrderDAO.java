package com.nt.dao;

import java.util.List;

import com.nt.model.Order;

public interface IOrderDAO {

	public void insertOrder(Order order);

	public List<Order> getAllOrder();

	public void deleteOrder(int bookId);

	public void updateOrder(Order order);

}
