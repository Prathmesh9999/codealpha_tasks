package com.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Transaction implements Serializable {

    private String stockSymbol;
    private int quantity;
    private double price;
    private TransactionType type;
    private LocalDateTime time;

    public Transaction(String stockSymbol,
                       int quantity,
                       double price,
                       TransactionType type) {

        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return type + " | " + stockSymbol +
               " | Qty:" + quantity +
               " | ₹" + price +
               " | " + time;
    }
}