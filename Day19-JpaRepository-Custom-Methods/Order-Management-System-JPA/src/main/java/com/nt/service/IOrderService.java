package com.nt.service;

import java.util.List;

import com.nt.model.Order;

public interface IOrderService{
public Iterable<Order> getTopScorers();
public  List<Order> filterStudentsWhoPassed();
public List<Order> getByName(String name);
public Iterable<Order> getStudentByCities(String cities);
}
