package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.entity.Patient;

public interface IPatientService {

	Page<Patient> showPatientInfoByPageNo(int pageNo, int pageSize, boolean ascOrder, String props);

	
	
	
}
