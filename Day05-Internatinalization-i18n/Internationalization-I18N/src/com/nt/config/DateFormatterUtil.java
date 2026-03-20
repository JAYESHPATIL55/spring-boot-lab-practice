package com.nt.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterUtil {

	public static String formatDateForLocale(Locale locale, LocalDate date) {

		DateTimeFormatter formatter;

		switch (locale.getLanguage()) {

		case "fr":
			formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);
			break;

		case "hi":
			formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", locale);
			break;
			
		case "mr":
			formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", locale);
			break;
		
		case "en":
			formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy",locale);
			break;
			
		default:
			formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy", locale);
		}

		return date.format(formatter);
	}
}