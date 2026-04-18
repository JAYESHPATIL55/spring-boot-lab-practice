package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Student;
import com.nt.reposiotry.IStudentRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private IStudentRepository repo;

	@Override
	public void run(String... args) throws Exception {

		Iterable<Student> stud = repo.findStudentByCourse("Java");
		stud.forEach(System.out::println);
		
		Iterable<Student> stud1 = repo.findStudentByMarksGreaterThan(450.00);
		stud1.forEach(System.out::println);
		Iterable<Student> stud2= repo.findStudentByMarks(250.00);
		stud2.forEach(System.out::println);
	}
	
	
}
