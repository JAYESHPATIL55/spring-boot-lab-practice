package com.nt.service;

import java.util.List;

import com.nt.model.Book;

public interface IBookService {
public void addBook(Book book);
public List<Book> retrieveAllBooks();
public void deleteBook(int bookId);
public void updateBook(Book book);
}
