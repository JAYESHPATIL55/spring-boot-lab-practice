package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{
List<Student>	findByCourse(String course);
List<Student> findByMarksGreaterThan(Double marks);
List<Student> findByMarksBetween(Double min, Double max);
List<Student> findByGrade(String grade);
List<Student>findByCity(String city);
List<Student> findByPassedTrue();
List<Student> findByNameStartingWith(String prefix);
List<Student> findByCourseAndPassed(String course, Boolean status);
List<Student> findTop3ByOrderByMarksDesc();
List<Student> findByCityNotIn(List<String> cities);
}