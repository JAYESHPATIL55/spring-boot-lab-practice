package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Book;

@Repository
public class BookDAOImpl implements IBookDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertBook(Book book) {
		String sql = "INSERT INTO BOOK VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, book.getBookId(), book.getTitle(), book.getAuthor(), book.getPrice());
		System.out.println("Record Inserted Successfully.");
	}

	@Override
	public List<Book> getAllBooks() {
		String sql = "SELECT * FROM BOOK";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			Book b = new Book();
			b.setBookId(rs.getInt("BOOKID"));
			b.setTitle(rs.getString("TITLE"));
			b.setAuthor(rs.getString("AUTHOR"));
			b.setPrice(rs.getDouble("PRICE"));
			return b;
		});
	}

	@Override
	public void deleteBook(int bookId) {
		String sql = "DELETE FROM BOOK WHERE bookId = ?";
		jdbcTemplate.update(sql, bookId);
		System.out.println("Record Deleted Successfully.");
	}

	@Override
	public void updateBook(Book book) {
		String sql = "UPDATE BOOK SET title = ? , author = ? , price = ? WHERE bookId = ?";
		jdbcTemplate.update(sql,
				book.getTitle(),
				book.getAuthor(),
				book.getPrice(),
				book.getBookId()
				);
	}

}
