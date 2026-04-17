package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repository.StudentRepository;
@Service
public class StudentService implements IStudentService{
@Autowired
private StudentRepository repo;
	@Override
	public void saveStudent(Student student) {
		 repo.save(student);
	}

	@Override
	public Optional<Student> getStudentDetails(Long id) {

		return repo.findById(id);
	}

}
