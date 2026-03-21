package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("loan")
public final class LoanService {

		@Autowired
		@Qualifier("home")
		private InterestStrategy interest;

		public void processLoan( double  prices) {
			
			double msg = interest.calculation(prices);
			
			System.out.println("Loan Type: "+interest.getClass()
					+ "\nLoan Amount:  "+prices
					+ "\nInterest Amount: "+msg);
			
		}
		
}
