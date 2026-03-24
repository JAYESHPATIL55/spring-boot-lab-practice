package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class EmployeeSalaryBonuseCalculationSystemApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ctx =	SpringApplication.run(EmployeeSalaryBonuseCalculationSystemApplication.class, args);
		Employee emps = ctx.getBean(Employee.class);
		System.out.println(emps);
	}

}
