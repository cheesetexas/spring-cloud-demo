package com.example.servicebook.controller;

import com.example.commons.entity.Book;
import com.example.servicebook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book getBookById(@PathVariable("bid") int bid) {
        return bookService.getBookById(bid);
    }
}
