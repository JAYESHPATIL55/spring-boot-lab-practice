package com.nt.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {

	@Query(value="SELECT id,name, course , marks FROM Student WHERE course= ?1",nativeQuery = true)
	public Iterable<Student> findStudentByCourse(String department);

	@Query(value="SELECT id, name , course ,marks FROM Student WHERE marks >= ?1",nativeQuery = true)
	public Iterable<Student> findStudentByMarksGreaterThan(Double salary);

	@Query(value="SELECT id, name , course ,marks FROM Student WHERE marks = ?1",nativeQuery = true)
	public Iterable<Student> findStudentByMarks(Double avg);
}
