package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.main.*;
@SpringBootApplication
public class CompanyDepartmentListSystemApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext ctx = 	SpringApplication.run(CompanyDepartmentListSystemApplication.class, args);
		ComapanyRunner runCompany = ctx.getBean(ComapanyRunner.class);
		System.out.println("---- Department List ----\n");
		for (Department dept : runCompany.getDepartments()) {
            System.out.println(
                "Dept ID : " + dept.getDeptId() +
                " | Dept Name : " + dept.getDeptName()
            );
		
	}

	}
}
