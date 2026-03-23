package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BookDAOImpl;
import com.nt.model.Book;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookDAOImpl bookDAO;

    public void addBook(Book book) {
        bookDAO.insertBook(book);
    }

    public List<Book> retrieveAllBooks() {
        return bookDAO.getAllBooks();
    }

    public void deleteBook(int bookId) {
        bookDAO.deleteBook(bookId);
    }

    public void updateBook(Book book) {
        bookDAO.updateBook(book);
    }
}