package com.cloudproject.bookstore.demo;

import java.util.List;

public class ShoppingCart {

    private List<CartItem> booksInCart;


    public List<BookItem> getBooksInCart() {
        return booksInCart.stream().map(b -> b.getBookInCart());
    }

    void addBookItem(BookItem newItem) {

        booksInCart.add(newItem);
    }

    void removeBookItem(BookItem bookItem) {
        booksInCart.remove(bookItem);
    }



}