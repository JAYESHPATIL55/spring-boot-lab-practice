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
public class Employee {
private int id;
private String name;
private double salary;
private String[] skills;
private List<String> projects;
private Set<String> tools;
private Map<String,Integer> experience;
private  Address address;

}
