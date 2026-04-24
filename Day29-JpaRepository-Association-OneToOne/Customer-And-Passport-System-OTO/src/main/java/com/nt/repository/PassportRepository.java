package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Customer;
import com.nt.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport,Long>{
	public Passport findPassportByPassportNumber(Long passportNumber);

}
