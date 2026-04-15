package com.nt.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.StudentCourseEnrollmentApplication;
import com.nt.model.Student;
import com.nt.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {

	private final StudentCourseEnrollmentApplication studentCourseEnrollmentApplication;

	@Autowired
	private StudentRepository repository;

	StudentRunner(StudentCourseEnrollmentApplication studentCourseEnrollmentApplication) {
		this.studentCourseEnrollmentApplication = studentCourseEnrollmentApplication;
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean working = true;
		while (working) {
			System.out.println("""
										=== Student Enrollment Menu ===
					1. Add Student
					2. View All Students
					3. Find Students by Course
					4. Find Students Below Fee
					5. Find Students by Grade
					6. Count Students in Course
					7. Search Student by Name
					8. Update Student Grade
					9. Delete Students by Course
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
				System.out.println("Enter Course: ");
				String course = sc.nextLine();
				System.out.println("Enter Fee: ");
				Double fee = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter grade: ");
				String grade = sc.nextLine();
				Student stud = new Student();
				stud.setId(id);
				stud.setName(name);
				stud.setCourse(course);
				stud.setFee(fee);
				stud.setGrade(grade);
				repository.save(stud);
//				List<Employee> emp =repository.saveEmployees(id,department, experience, name, salary);
//				System.out.println(" "+emp);
				System.out.println("Employee Save." + stud.toString());
				break;
			case 2:
				List<Student> stud1 = repository.showStudent();
				stud1.forEach(System.out::println);
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter The Course: ");
				String dept = sc.nextLine();
				List<Student> stud2 = repository.showStudentByCourse(dept);
				stud2.forEach(System.out::println);
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter The Fee From: ");
				Double fee1 = sc.nextDouble();
				System.out.println("Enter The Fee To: ");
				Double fee2 = sc.nextDouble();
				List<Student> stud3 = repository.showStudentByFeeBetweenRang(fee1, fee2);
				stud3.forEach(System.out::println);
				break;
			case 5:
				sc.nextLine();
				System.out.println("Enter The grade: ");
				String exp1 = sc.nextLine();
				List<Student> stud4 = repository.showStudentByGrade(exp1);
				stud4.forEach(System.out::println);
				break;
			case 6:
				sc.nextLine();
				System.out.println("Enter The course: ");
				String dept1 = sc.nextLine();
				List<Student> stud5 = repository.showStudentByCourse(dept1);
				System.out.println(stud5.size());
				break;
			case 7:
				sc.nextLine();
				System.out.println("Enter The Name Of Student: ");
				String names = sc.nextLine();
				List<Student> stud6 = repository.findStudentByName(names);
				System.out.println("Student:  " + stud6);
				break;
			case 8:
				sc.nextLine();
				System.out.println("Enter The Id: ");
				Long ids = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter The Grade: ");
				String increase = sc.nextLine();
				int stud7 = repository.updateStudentGrade(ids, increase);
				System.out.println(stud7);
				break;
			case 9:
				sc.nextLine();
				System.out.println("Enter The Course Of Students: ");
				String crs = sc.nextLine();
				int stud8 = repository.deleteStudentByCourse(crs);
				System.out.println(stud8+" Course " + crs + " Students Deleted. ");
				break;
			case 0:
				System.exit(0);
				break;

			}
		}
	}

}