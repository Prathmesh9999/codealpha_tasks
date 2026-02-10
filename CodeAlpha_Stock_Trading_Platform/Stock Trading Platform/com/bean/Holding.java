package com.bean;

import java.io.Serializable;

public class Holding implements Serializable {

    private String stockSymbol;
    private int quantity;
    private double avgPrice;

    public Holding(String stockSymbol,
                   int quantity,
                   double avgPrice) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.avgPrice = avgPrice;
    }

    public String getStockSymbol() { return stockSymbol; }
    public int getQuantity() { return quantity; }
    public double getAvgPrice() { return avgPrice; }

    public void addQuantity(int qty, double price) {

        double totalCost =
            (avgPrice * quantity) + (price * qty);

        quantity += qty;
        avgPrice = totalCost / quantity;
    }

    public void sellQuantity(int qty) {
        quantity -= qty;
    }
}