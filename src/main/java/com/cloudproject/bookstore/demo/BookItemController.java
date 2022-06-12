package com.cloudproject.bookstore.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.ArrayList;



public class BookItemController {

    BookRepository bookRepository;

    public BookItemController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(path="/book-item")
    List<BookItem> getBookItems() {
        return bookRepository.getBooks();
    }

    @GetMapping(path="/book-item/{id}")
    public BookItem getBookItemByID(Integer id) {
        return bookRepository.getBookById(id);
    }


}
