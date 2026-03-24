package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Employee {
	@Value("${emp.empId}")
	private Integer empId;
	@Value("${emp.empName}")
	private String empName;
	@Value("${emp.monthSalary}")
	private Double monthSalary;
	@Value("${emp.bonus}")
	private Double bonus;
	@Value("#{${emp.monthSalary} * 12 + ${emp.bonus}}")
	private Double yearSalary;

	@Override
	public String toString() {
		return "Employee empId = " + empId + ", \nempName = " + empName + ",\nmonthSalary = " + monthSalary
				+ ", \nbonus = " + bonus + ", \nyearSalary = " + yearSalary + "]";
	}

}