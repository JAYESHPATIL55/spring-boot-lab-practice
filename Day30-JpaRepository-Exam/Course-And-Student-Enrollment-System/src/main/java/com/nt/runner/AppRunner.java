package com.nt.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.EmployeeAndIdCardManagementSystemOtoApplication;
import com.nt.entity.Course;
import com.nt.entity.Student;
import com.nt.repository.CourseRepository;

@Component
public class AppRunner implements CommandLineRunner{

    private final EmployeeAndIdCardManagementSystemOtoApplication employeeAndIdCardManagementSystemOtoApplication;
@Autowired
private CourseRepository repo;

    AppRunner(EmployeeAndIdCardManagementSystemOtoApplication employeeAndIdCardManagementSystemOtoApplication) {
        this.employeeAndIdCardManagementSystemOtoApplication = employeeAndIdCardManagementSystemOtoApplication;
    }
	@Override
	public void run(String... args) throws Exception {
			
		
			Course c = new Course();
			c.setCourseName("Java");
			c.setDuration("1 Year");
			c.setId(1l);
			Student s2 = new Student();
			s2.setId(1l);
			s2.setGrade("A");
			s2.setEmail("Jayesh@gmail.com");
			s2.setStudentName("jayesh");
			s2.setCourses(c);
			Student s1 = new Student();
			s1.setId(2l);
			s1.setGrade("B");
			s1.setEmail("Kartik@gmail.com");
			s1.setStudentName("Kartik");
			s1.setCourses(c);
			
			c.setStudents(Arrays.asList(s1,s2));
			repo.save(c);
			System.out.println("All Students and Course");
			List<Course> list = repo.findAll();
			list.forEach(System.out::println);
			System.out.println("Students and Course By Id");
			Optional<Course> itr = repo.findById(1l);
			itr.ifPresent(System.out::println);
	}
	
	
	
}
