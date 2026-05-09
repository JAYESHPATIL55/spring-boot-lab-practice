package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/result")
	public String showResult (Map<String,Object> map) {
		Student stud = new Student(1,"Jayesh Patil","Java Full Stack","North Maharashtra University",new Double[] {78d,89d,90d,98d,66d});
		map.put("id",stud.getId());
		map.put("name",stud.getName());
		map.put("course",stud.getCourse());
		map.put("college",stud.getCollege());
		int j = 0;
		for(double d :stud.getMarks() ) {
			map.put("m"+j++,d);
		}
//		map.put("marks",stud.getMarks());
		double total = 00.00;
		for(double i: stud.getMarks() ) {
			total+= i;
		}
		
		map.put("total", total);
		double avg =(Double) total / 5;
		map.put("average", avg);
		
		String grade = "";
		if(avg >= 90) {
			grade = "A";
		}
		else if(avg > 90 && avg <= 75) {
			
			grade = "B";
		}
		else if(avg > 75 && avg <= 60) {
			
			grade = "C";
		}
		else {
			grade = "D";
			
		}
		map.put("grade" ,grade);
		
		return "result";
		
	}
	
	@GetMapping("/")
	public String display() {
		return "display";
	}
	
	
	

}
