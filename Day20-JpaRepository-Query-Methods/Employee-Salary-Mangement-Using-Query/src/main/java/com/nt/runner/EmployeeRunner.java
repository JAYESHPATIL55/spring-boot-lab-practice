package com.nt.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.EmployeeSalaryApplication;
import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {

	private final EmployeeSalaryApplication employeeSalaryApplication;

	@Autowired
	private EmployeeRepository repository;

	EmployeeRunner(EmployeeSalaryApplication employeeSalaryApplication) {
		this.employeeSalaryApplication = employeeSalaryApplication;
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean working = true;
		while (working) {
			System.out.println("""
					=== Employee Salary Menu ===
					1. Add Employee
					2. View All Employees
					3. Find by Department
					4. Find Salary Between Range
					5. Find Experienced Employees
					6. Count Employees in Department
					7. Highest Salary Employee
					8. Increase Salary
					9. Delete Low Salary Employees
					0. Exit
										""");
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				System.out.println("Enter ID: ");
				Long id = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter Name:");
				String name = sc.nextLine();
				System.out.println("Enter DEPARTMENT: ");
				String department = sc.nextLine();
				System.out.println("Enter SALARY: ");
				Double salary = sc.nextDouble();
				System.out.println("Enter EXPERIENCE: ");
				Integer experience = sc.nextInt();
				Employee emp = new Employee();
				emp.setId(id);
				emp.setName(name);
				emp.setDepartment(department);
				emp.setSalary(salary);
				emp.setExperience(experience);
				repository.save(emp);
//				List<Employee> emp =repository.saveEmployees(id,department, experience, name, salary);
//				System.out.println(" "+emp);
				System.out.println("Employee Save." + emp.toString());
				break;
			case 2:
				List<Employee> emp1 = repository.showEmployee();
				 emp1.forEach(System.out::println);
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter The Department: ");
				String dept = sc.nextLine();
				List<Employee> emp2 = repository.showEmployeeByDepartment(dept);
				emp2.forEach(System.out::println);
				break;
			case 4:
				System.out.println("Enter The Salary From: ");
				Double salary1 = sc.nextDouble();
				System.out.println("Enter The Salary To: ");
				Double salary2 = sc.nextDouble();
				List<Employee> emp3 = repository.showEmployeeBySalaryBetweenRang(salary1, salary2);
				emp3.forEach(System.out::println);
				break;
			case 5:
				System.out.println("Enter The Experience: ");
				Integer exp1 = sc.nextInt();
				sc.nextLine();
				List<Employee> emp4 = repository.showEmployeeByExperience(exp1);
				emp4.forEach(System.out::println);
				break;
			case 6:
				sc.nextLine();
				System.out.println("Enter The Department: ");
				String dept1 = sc.nextLine();
				List<Employee> emp5 = repository.showEmployeeByDepartment(dept1);
				System.out.println(emp5.size());
				break;
			case 7:
				List<Employee> emp6 = repository.findHighestSalaryEmployee();
				System.out.println("Highest Salary:  " + emp6);
				break;
			case 8:
				System.out.println("Enter The percentage to Increase the salary for all: ");
				Double increase = sc.nextDouble();
				int  emp7 = repository.increaseSalaryByPercent(increase);
				System.out.println(emp7);
				break;
			case 9:
				List<Employee> emp8 = repository.deleteLowestSalaryEmployee();
				System.out.println(emp8);
				System.out.println("Lowest Employee Deleted. ");
				break;
			case 0:
				System.exit(0);
				break;

			}
		}
	}

}