package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.main.*;

@SpringBootApplication
public class CollegeStudentSystemApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(CollegeStudentSystemApplication.class, args);
		CollegeRunner runCompany = ctx.getBean(CollegeRunner.class);
		System.out.println("---- Department List ----\n");
		for (Student dept : runCompany.getDepartments()) {
			System.out.println("Dept ID : " + dept.getDeptId() + " | Dept Name : " + dept.getDeptName());

		}

	}
}
