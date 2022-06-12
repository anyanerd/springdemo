package com.cloudproject.bookstore.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.ArrayList;


public class ShoppingCartController {

    BookRepository bookRepository;
    ShoppingCart cart;

    public ShoppingCartController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping(path="shopping-cart/{id}")
    public ShoppingCart addBookItem(Integer id) {

        BookItem bookItem = bookRepository.getBookById(id);
        if (bookItem != null) {
            cart.addBookItem(bookItem);
        }
        return cart;
    }

    @DeleteMapping(path="shopping-cart/{id}")
    public ShoppingCart removeBookItem(Integer id) {

        BookItem bookItem = bookRepository.getBookById(id);
        if (bookItem != null) {
            cart.removeBookItem(bookItem);
        }
        return cart;
    }

}
