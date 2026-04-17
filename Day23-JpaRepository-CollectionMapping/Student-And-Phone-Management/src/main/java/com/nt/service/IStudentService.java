package com.nt.service;

import java.util.Optional;

import com.nt.entity.Student;

public interface IStudentService {

	public void saveStudent(Student student);
	public Optional<Student> getStudentDetails(Long id);
}
