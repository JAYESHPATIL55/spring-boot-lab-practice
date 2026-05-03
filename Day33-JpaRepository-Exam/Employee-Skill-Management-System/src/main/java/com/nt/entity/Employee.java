package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {
@Id
private Long id;
private String name;
@ManyToMany(targetEntity = Skill.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinTable(name = "employe",joinColumns = @JoinColumn(name="Employee_id"),
inverseJoinColumns = @JoinColumn(name="Skill_id"))
List<Skill> skills;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", skills=" + skills + "]";
}

}
