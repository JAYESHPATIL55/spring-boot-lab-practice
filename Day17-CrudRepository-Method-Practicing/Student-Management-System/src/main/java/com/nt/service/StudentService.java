package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repository.StudentRepository;
@Service
public class StudentService  implements IStudentService{
		
	@Autowired
	private StudentRepository repository;
	
	@Override
	public List<Student> getTopScorers() {
		return repository.findTop3ByOrderByMarksDesc();
	}

	@Override
	public List<Student> filterStudentsWhoPassed() {
		return repository.findByPassedTrue();
		
	}

	@Override
	public List<Student> getByName(String name) {
		return repository.findByNameStartingWith(name);
	}

	@Override
	public List<Student> getStudentByCities(String city) {
		return repository.findByCity(city);
	}
	
	
}