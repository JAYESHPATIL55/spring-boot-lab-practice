package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
