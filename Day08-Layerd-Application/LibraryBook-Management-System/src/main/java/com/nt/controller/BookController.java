package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Book;
import com.nt.service.BookServiceImpl;
@Controller
public class BookController {
	@Autowired
	private BookServiceImpl bookService;
public void addBook(Book book) {
	bookService.addBook(book);
}
public List<Book> retrieveAllBook(){
	
	return bookService.retrieveAllBooks();
}
public void deleteBook(int bookId) {
	bookService.deleteBook(bookId);
}
public void updateBook(Book book) {
	bookService.updateBook(book);
}
}
