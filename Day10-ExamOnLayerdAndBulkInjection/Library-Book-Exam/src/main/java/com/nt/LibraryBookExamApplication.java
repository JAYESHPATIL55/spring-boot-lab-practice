package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.main.*;

@SpringBootApplication
public class LibraryBookExamApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(LibraryBookExamApplication.class, args);
		LibraryConfig book = ctx.getBean(LibraryConfig.class);
		int n = book.getBooks().size();
		for(int i = 0; i < n;i++) {
			System.out.println("\nName Of Book "+book.getBooks().get(i));
			
		}

	}
}
