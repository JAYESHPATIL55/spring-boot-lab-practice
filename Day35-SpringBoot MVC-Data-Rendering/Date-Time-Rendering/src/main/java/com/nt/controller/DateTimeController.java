package com.nt.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.DateTimeRenderingApplication;

@Controller
public class DateTimeController {

    private final DateTimeRenderingApplication dateTimeRenderingApplication;

    DateTimeController(DateTimeRenderingApplication dateTimeRenderingApplication) {
        this.dateTimeRenderingApplication = dateTimeRenderingApplication;
    }
@RequestMapping("/datetime")
	public String showDateTime(Map<String,Object> map) {
		
		map.put("time", LocalDateTime.now() );
		
		map.put("date", LocalDate.now());
		
		return "datetime";
	}
}
