package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Patient;
import com.nt.repository.PatientRepository;

@Service
public class PatientService implements IPatientService{

	@Autowired
	private PatientRepository repo;
	
	@Override
	public Page<Patient> showPatientInfoByPageNo(int pageNo, int pageSize, boolean ascOrder, String props) {

		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, props);

		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

		Page<Patient> page = repo.findAll(pageable);
		return page;

	}

}
