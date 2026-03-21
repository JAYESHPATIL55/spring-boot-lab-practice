package com.nt.comp;

import java.util.Scanner;

import org.springframework.stereotype.Component;


@Component
public class SeasonService {
	public static String getSeason(int month) {
		if(month >= 3 && month <= 6)  {
			return " Summer ";
		}
		else if(month >= 7 &&  month <= 10)  {
			return " Rainy ";
		}
		else if(month >= 11  && month <= 2)  {
			return " Winter ";
		}
		else {
			
			return " Not Valid Month ";
		}
		
	}
}
