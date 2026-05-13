package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")	
	public String showPage() {
			return "display";
		}
	
@GetMapping("/form")
public String getMethodName(@ModelAttribute Student s) {
    return "form";
}

	
@GetMapping("/form23")
public String showDetailsOfStudent( @RequestParam("name") String name,
        @RequestParam("rollNo") int rollNo,
        @RequestParam("marks1") int marks1,
        @RequestParam("marks2") int marks2,
        @RequestParam("marks3") int marks3, Map<String, Object> map) {
	map.put("sid", rollNo);
	map.put("sname", name);
	map.put("marks",  marks1 + " " + marks2+" "+marks3);
	Integer total =marks1+marks2+marks3;
	map.put("total", total);
	Float percentage =(float) total/3;
	map.put("percentage", percentage);
	String grade = "";
	if(percentage >= 90) {
		grade = "A";
	}
	else if (percentage < 90 && percentage >= 80) {
		grade = "B";
	}
	else if(percentage >= 60 && percentage <80) {
		grade = "C";
	}
	else {
		grade = "Fail";
	}
	map.put("grade", grade);
	
	return "success";
}
}
