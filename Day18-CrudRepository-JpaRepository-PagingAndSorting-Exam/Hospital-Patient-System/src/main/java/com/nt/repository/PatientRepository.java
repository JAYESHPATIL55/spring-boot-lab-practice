package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {


}
