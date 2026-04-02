package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.main.StudentRunner;

@SpringBootApplication
public class StudentCourseManagementSystemApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(StudentCourseManagementSystemApplication.class, args);
		StudentRunner stud = ctx.getBean(StudentRunner.class);
		System.out.println("Id: "+stud.getId());
		System.out.println("Name:  "+stud.getName());
		System.out.println("Course: "+stud.getCourse());
		System.out.println("Hobbies: "+stud.getHobbies());
		System.out.println("Subjects: "+stud.getSubjects());
		System.out.println("Certification: "+stud.getCertifications());
		System.out.println("Marks: "+stud.getMarks());
		System.out.println("Address: "+stud.getAddress());
	}
}
