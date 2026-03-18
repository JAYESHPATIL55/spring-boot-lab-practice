package com.nt.main;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("info.college")
@Data
public class CollegeRunner {

	private List<Student> students;

}
