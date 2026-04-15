package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.model.Student;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student, Long> {

	

	
	@Query("FROM Student WHERE course = ?1")
	public List<Student> showStudentByCourse(String course);
	
	@Query("FROM Student WHERE grade = :grade")
	public List<Student> showStudentByGrade(String grade);

	@Query("FROM Student WHERE fee >= :fee AND fee <= :values")
	public List<Student> showStudentByFeeBetweenRang(@Param("fee") Double value, Double values);

	@Query("FROM Student WHERE name = ?1%")
	public List<Student> getStudentByNameContaining(String str);
	
	@Query("FROM Student WHERE name = :name")
	List<Student> findStudentByName(String name);
	
	@Modifying
	@Transactional
	@Query("UPDATE Student e SET e.grade = :grade Where e.id = :ids")
	int  updateStudentGrade(Long ids, @Param("grade") String percent);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Student s WHERE s.course = :course")
	int deleteStudentByCourse(@Param("course") String course);
	
	//SELECT id, name, department, salary, experience 
	@Query("FROM Student")
	public List<Student> showStudent();
	
	@Query("SELECT id, name, course, fee, grade FROM Student WHERE fee >= :fee")
	public List<Student> getStudentByFee(Double fee);
}