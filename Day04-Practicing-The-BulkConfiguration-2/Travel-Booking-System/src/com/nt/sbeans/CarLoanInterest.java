package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("car")
@Lazy(true)
public class CarLoanInterest implements InterestStrategy{

	@Override 
	public double calculation(double amount) 
	{
		return (double) (0.09*amount);
	}
}
