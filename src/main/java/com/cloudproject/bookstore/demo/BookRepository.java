package com.cloudproject.bookstore.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepository {
    List<BookItem> books = new ArrayList<>();

    public List<BookItem> getBooks() {
        return books;
    }

    public BookItem getBookById(Integer id) {
        var optional = books.stream().filter(b -> b.getBookId().equals(id)).findFirst();
        return optional.isPresent() ? optional.get() : null;
    }

}
