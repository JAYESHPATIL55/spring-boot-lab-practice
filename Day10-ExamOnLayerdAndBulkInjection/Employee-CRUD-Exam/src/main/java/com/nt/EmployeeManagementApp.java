package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@SpringBootApplication
public class EmployeeManagementApp {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(EmployeeManagementApp.class, args);

        EmployeeController controller = context.getBean(EmployeeController.class);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Insert Employee");
            System.out.println("2 View Employee");
            System.out.println("3 Delete Employee");
            System.out.println("4 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Employee p = new Employee();

                    System.out.println("Enter ID:");
                    p.setEId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter Name:");
                    p.setEName(sc.nextLine());

                    System.out.println("Enter Department:");
                    p.setEDepartment(sc.nextLine());

                    System.out.println("Enter Salary:");
                    p.setESalary(sc.nextDouble());

                    controller.addProduct(p);
                    System.out.println("Employee Added");
                    break;

                case 2:
                    List<Employee> employees = controller.retrieveAllEmployee();
                    employees.forEach(emp ->
                            System.out.println(emp.getEId() + " "
                                    + emp.getEName() + " "
                                    + emp.getEDepartment() + " "
                                    + emp.getESalary()));
                    break;

                case 3:
                    System.out.println("Enter Employee ID to delete:");
                    controller.deleteEmployee(sc.nextInt());
                    System.out.println("Employee Deleted");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}