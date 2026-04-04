package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Travel;
import com.nt.repository.TravelRepository;

@Service
public class TravelService implements ITravelService {
	@Autowired
	private TravelRepository travelRepository;

	@Override
	public void addTravel(Travel travel) {
		travelRepository.save(travel);
	}

	@Override
	public Iterable<Travel> getAllTravels() {
		return travelRepository.findAll();
	}

	@Override
	public Optional<Travel> findAllTravels(Long ids) {
		return travelRepository.findById(ids);
	}

}
