package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.BookController;
import com.nt.model.Book;

@SpringBootApplication
public class BookManagementApp {

    private final BookController bookController;

    BookManagementApp(BookController bookController) {
        this.bookController = bookController;
    }

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(BookManagementApp.class, args);
        
        BookController controller = context.getBean(BookController.class);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Insert Book");
            System.out.println("2 View Books");
            System.out.println("3 Delete Book");
            System.out.println("4 Update Book");
            System.out.println("5 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Book p = new Book();

                    System.out.println("Enter BookID:");
                    p.setBookId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Enter Title-Name:");
                    p.setTitle(sc.nextLine());

                    System.out.println("Enter Author:");
                    p.setAuthor(sc.nextLine());

                    System.out.println("Enter Price:");
                    p.setPrice(sc.nextDouble());

                    controller.addBook(p);
                    System.out.println("Book Added");
                    break;

                case 2:
                    List<Book> books = controller.retrieveAllBook();
                    books.forEach(book ->
                            System.out.println(book.getBookId() + " "
                                    + book.getTitle() + " "
                                    + book.getAuthor() + " "
                                    + book.getPrice()));
                    break;

                case 3:
                    System.out.println("Enter Book ID to delete:");
                    controller.deleteBook(sc.nextInt());
                    System.out.println("Book Deleted");
                    break;

                case 4:
                    Book up = new Book();

                    System.out.println("Enter Book ID:");
                    up.setBookId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Enter New Title-Name:");
                    up.setTitle(sc.nextLine());

                    System.out.println("Enter New Author:");
                    up.setAuthor(sc.nextLine());

                    System.out.println("Enter New Price:");
                    up.setPrice(sc.nextDouble());

                    controller.updateBook(up);
                    System.out.println("Book Updated");
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}