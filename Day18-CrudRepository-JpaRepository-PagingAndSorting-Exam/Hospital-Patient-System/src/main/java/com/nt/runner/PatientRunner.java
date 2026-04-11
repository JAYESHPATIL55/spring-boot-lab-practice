package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Patient;
import com.nt.repository.PatientRepository;
import com.nt.service.PatientService;

@Component
public class PatientRunner implements CommandLineRunner{

	@Autowired
	private PatientRepository repo;
	
	@Autowired
	private PatientService service;
	@Override
	public void run(String... args) throws Exception {
//System.out.println("Insert");
//			repo.save(new Patient(1,"jay","fiver",21));
//			repo.save(new Patient(2,"kartik","leg pain",23));
//			repo.save(new Patient(3,"yash","hair loss",25));
//			repo.save(new Patient(4,"jayesh","fiver",21));
//			
//			System.out.println("Update");
//			
//			repo.save(new Patient(1,"jay","body Itching",27));
//			
//			System.out.println("Delete");
//			repo.deleteById(1);
			System.out.println("show all");
			
			Iterable<Patient> it = repo.findAll();
			it.forEach(System.out::println);
			
			System.out.println("page Sorting");
			Page<Patient> page= service.showPatientInfoByPageNo(0, 2, true, "id");
			page.forEach(System.out::println);
		
	}

}
