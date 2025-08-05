package com.example.books.controller;

import com.example.books.dao.BookDAO;
import com.example.books.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookDAO bookDAO;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookDAO.getAllBooks();
    }
}
