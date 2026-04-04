package com.nt.service;

import java.util.Optional;

import com.nt.entity.Travel;

public interface ITravelService {

	void addTravel(Travel travel);

	Iterable<Travel> getAllTravels();

	Optional<Travel> findAllTravels(Long ids);

}