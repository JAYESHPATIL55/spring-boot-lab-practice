package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Student;
import com.nt.service.StudentService;
@Component
public class StudentRunner implements CommandLineRunner{
	@Autowired
	private StudentService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			Student s1 = new Student(1l, "Jayesh", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Student s2 = new Student(2l, "Om", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Student s3 = new Student(3l, "Kartik", "Java Full Stack", 85.20, "B", "Hyderabad", true);
			Student s4 = new Student(4l, "Sandesh", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Student s5 = new Student(5l, "Vesh", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Student s6 = new Student(6l, "Vinay", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			Student s7 = new Student(7l, "Shreyash", "Java Full Stack", 85.20, "A", "Hyderabad", true);
			
			service.getStudentByCities("hyd").forEach(System.out::println);
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
	
}