package com.nt.config;
import java.time.LocalDate;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
        Locale locale = LocaleSelector.getLocaleFromUser();

        LocalDate today = LocalDate.now();

        String formattedDate =
                DateFormatterUtil.formatDateForLocale(locale, today);
        MessageSource messageSource = context.getBean(MessageSource.class);
        String message = messageSource.getMessage(
                "date.message",
                new Object[]{formattedDate},
                locale
        );

        System.out.println(message);
        System.out.println("If You want to Exit Type [true either false]");
        exit = sc.nextBoolean();
        }
    }
}