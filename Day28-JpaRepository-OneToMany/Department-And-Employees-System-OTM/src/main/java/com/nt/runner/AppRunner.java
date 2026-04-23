package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.DepartmentService;
@Component
public class AppRunner implements CommandLineRunner {
@Autowired
private DepartmentService service;
//	@Autowired
//	private DepartmentRepository repo;
	@Override
	public void run(String... args) throws Exception {

		try {
			
//			Department department = new Department(102L,"FINANCE","Hyderabad",null);
//			List<Employee> list=List.of(new Employee("Kartik",70000.00,"QA",department));
//			department.setEmployees(list);
//			service.saveDepartment(department);
			
//			Department dep = service.getDepartmentByName("FINANCE");
//			service.saveEmployeeToDepartment("FINANCE", Arrays.asList(new Employee("Vesh",45000.00,"QA",dep)
//																					,new Employee("Vinay",75000.00,"QA",dep)
//																					,new Employee("Shreyash",90000.00,"QA",dep)));
//			
			service.getEmployeeByDepartment(102l).ifPresent(emp->emp.getEmployees().forEach(System.out::println));
			
			service.getEmployeeBySalaryGreaterThan(70000.00).forEach(System.out::println);
//			service.saveDepartment(new Department(1l,"IT","Bengaluru",Arrays.asList(new Employee(1l,"jayesh",570000.00,"Software Developer",null),new Employee(null))));
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}

}
