package com.nt.config;

import java.util.Locale;
import java.util.Scanner;

public class LocaleSelector {

    public static Locale getLocaleFromUser() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter locale (en, fr, hi, te, mr, gj, pj): ");

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
        else if(language.equalsIgnoreCase("te")) {
            return Locale.forLanguageTag("te");
        }
        else if(language.equalsIgnoreCase("mr")) {
            return Locale.forLanguageTag("mr");
        }
        else if(language.equalsIgnoreCase("gj")) {
            return Locale.forLanguageTag("gj");
        }
        else if(language.equalsIgnoreCase("pj")) {
            return Locale.forLanguageTag("pj");
        }
        else {
            return Locale.ENGLISH;
        }
    }
}