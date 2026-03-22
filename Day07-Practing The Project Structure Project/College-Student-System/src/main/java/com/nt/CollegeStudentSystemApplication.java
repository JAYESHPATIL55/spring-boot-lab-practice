package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.main.*;

@SpringBootApplication
public class CollegeStudentSystemApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(CollegeStudentSystemApplication.class, args);
		CollegeRunner collegeRun = ctx.getBean(CollegeRunner.class);
		System.out.println("---- Student List ----\n");
		for (Student stud : collegeRun.getStudents()) {
			System.out.println("Student ID : " + stud.getId() + " | Student Name : " + stud.getName() + " | Student Marks: "+stud.getMarks());

		}

	}
}
