package com.nt.main;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties("info.employee")
public class Student {
private int id;
private String name;
private String course;
private String[] hobbies;
private List<String> subjects;
private Set<String> certifications;
private Map<String,Integer> marks;
private  Address address;

}
