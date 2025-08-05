package com.example.books.rowmapper;

import com.example.books.model.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book b = new Book();
        b.setBookid(rs.getInt("bookid"));
        b.setBookname(rs.getString("bookname"));
        b.setAuthor(rs.getString("author"));
        b.setPrice(rs.getInt("price"));
        return b;
    }
}
