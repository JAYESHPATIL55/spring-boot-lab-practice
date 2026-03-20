package com.nt.config;

import java.util.Locale;
import java.util.Scanner;

public class LocaleSelector {

    public static Locale getLocaleFromUser() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter locale (English -> en,French ->  fr,Hindi  -> hi, Marathi -> mr): ");

        String language = scanner.nextLine();

        if(language.equalsIgnoreCase("en")) {
            return Locale.ENGLISH;
        }
        else if(language.equalsIgnoreCase("fr")) {
            return Locale.FRENCH;
        }
        else if(language.equalsIgnoreCase("hi")) {
            return Locale.forLanguageTag("hi");
        }
        else if(language.equalsIgnoreCase("mr")) {
            return Locale.forLanguageTag("mr");
        }
        else {
            return Locale.ENGLISH;
        }
    }
}