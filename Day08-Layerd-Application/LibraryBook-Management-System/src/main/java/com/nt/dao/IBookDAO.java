package com.nt.dao;

import java.util.List;

import com.nt.model.Book;

public interface IBookDAO {

	public void insertBook(Book book);

	public List<Book> getAllBooks();

	public void deleteBook(int bookId);

	public void updateBook(Book book);

}
