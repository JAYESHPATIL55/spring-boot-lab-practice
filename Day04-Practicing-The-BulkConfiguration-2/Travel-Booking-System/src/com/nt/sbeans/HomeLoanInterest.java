package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("home")
@Lazy(true)
@Primary
public class HomeLoanInterest implements InterestStrategy {
	
@Override 
public double calculation(double amount) {
	return (double)(0.07*amount);
}
}
