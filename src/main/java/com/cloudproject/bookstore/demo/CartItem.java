package com.cloudproject.bookstore.demo;

public class CartItem {
    private Integer quantity = 0;
    private BookItem bookInCart;

    public CartItem(BookItem bookInCart) {
        this.bookInCart = bookInCart;
    }

    public int getQuantity() {
        if(this.quantity <1 || this.quantity > 800) {
            return -1;}
        return quantity;
    }


    private CartItem increaseQuantity(Integer quantity) {
        if (quantity <= 0) {
            throw new RuntimeException("Wrong quantity");
        }
        this.quantity += quantity;

        return this;
    }

    private CartItem decreaseQuantity(Integer quantity) {
        if (quantity <= 0 && quantity > this.quantity) {
            throw new RuntimeException("Wrong quantity");
        }
        this.quantity -= quantity;

        return this;
    }

    public BookItem getBookInCart() {
        return bookInCart;
    }
}
