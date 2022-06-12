package com.cloudproject.bookstore.demo;

import java.util.List;

public class ShoppingCart {

    private List<BookItem> booksInCart;

    public List<BookItem> getBooksInCart() {
        return booksInCart;
    }

    void addBookItem(BookItem newItem) {
        booksInCart.add(newItem);
    }

    void removeBookItem(BookItem bookItem) {
        booksInCart.remove(bookItem);
    }


}