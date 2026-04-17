package com.nt.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Student;
import com.nt.service.IStudentService;

@Component
public class AppRunners implements CommandLineRunner {

	@Autowired
	private IStudentService service;

	@Override
	public void run(String... args) throws Exception {

//		Student s2 = new Student(2l, "Vesh",
//				Arrays.asList("9228472927", "7381097467", "772883982", "2848278192", "8988009091"));
//		Student s3 = new Student(3l, "Shreyash",
//				Arrays.asList("8444841928", "2929419090", "27828", "9078564280", "7810285634"));
//		Student s4 = new Student(4l, "Vinay",
//				Arrays.asList("7466266289", "8267487488", "783738999", "7878989889", "7892283991"));
//		service.saveStudent(s2);
//		service.saveStudent(s4);
//		service.saveStudent(s3);
		Optional<Student> optional = service.getStudentDetails(2l);
		System.out.println(optional);
//		list.forEach(System.out::println);
//		while (optional.isPresent()) {
//			System.out.println(optional.get().getId());
//			System.out.println(optional.get().getName());
//			System.out.println(optional.get().getPhoneNumbers());
//		}
	}

}
