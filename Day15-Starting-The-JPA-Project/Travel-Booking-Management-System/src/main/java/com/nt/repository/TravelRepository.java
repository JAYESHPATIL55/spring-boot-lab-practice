package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Travel;

public interface TravelRepository  extends CrudRepository<Travel, Long> {
	
}