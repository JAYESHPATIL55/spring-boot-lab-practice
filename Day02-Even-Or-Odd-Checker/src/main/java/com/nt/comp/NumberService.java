package com.nt.comp;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class NumberService {
	public static String checkEvenOdd(int number) {
		if (number % 2 == 0) {
			return " Even ";

		} else {
			return " Odd ";
		}
	}
}
