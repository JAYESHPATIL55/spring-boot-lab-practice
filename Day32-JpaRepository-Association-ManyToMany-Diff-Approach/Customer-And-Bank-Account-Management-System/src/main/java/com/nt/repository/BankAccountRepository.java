package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
