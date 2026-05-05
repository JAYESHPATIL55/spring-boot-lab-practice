package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/students")
	public Map<String, String> showStudents(Map<String, String> map) {
		map.put("Jayesh", "Name");
		map.put("Kartik", "Name");
		map.put("Vesh", "Name");
		map.put("Vinay", "Name");
		map.put("Shreyash", "Name");
		
		return map;
	}
}
