package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.OrderDAOImpl;
import com.nt.model.Order;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderDAOImpl bookDAO;

    public void addOrder(Order order) {
        bookDAO.insertOrder(order);
    }

    public List<Order> retrieveAllOrders() {
        return bookDAO.getAllOrder();
    }

    public void deleteOrder(int bookId) {
        bookDAO.deleteOrder(bookId);
    }

    public void updateOrder(Order order) {
        bookDAO.updateOrder(order);
    }
}