package com.nt.service;

import java.util.List;

import com.nt.model.Student;

public interface IStudentService{
public Iterable<Student> getTopScorers();
public  List<Student> filterStudentsWhoPassed();
public List<Student> getByName(String name);
public Iterable<Student> getStudentByCities(String cities);
}
