package com.service;

import com.bean.*;
import com.data.DataStore;

public class TradingService {

    public void buyStock(String userId,
                         String symbol,
                         int qty) {

        User user =
            DataStore.users
                .computeIfAbsent(userId, User::new);

        Stock stock = DataStore.market.get(symbol);

        if (stock == null) {
            System.out.println("Stock not found");
            return;
        }

        Holding holding =
            user.getPortfolio()
                .getOrDefault(symbol,
                    new Holding(symbol,0,0));

        holding.addQuantity(qty, stock.getPrice());

        user.getPortfolio().put(symbol, holding);

        user.getTransactions().add(
            new Transaction(symbol, qty,
                stock.getPrice(),
                TransactionType.BUY));

        System.out.println("Stock Bought ✅");
    }

    public void sellStock(String userId,
                          String symbol,
                          int qty) {

        User user = DataStore.users.get(userId);

        if (user == null ||
            !user.getPortfolio().containsKey(symbol)) {

            System.out.println("No holdings");
            return;
        }

        Holding h =
            user.getPortfolio().get(symbol);

        if (h.getQuantity() < qty) {
            System.out.println("Insufficient qty");
            return;
        }

        h.sellQuantity(qty);

        user.getTransactions().add(
            new Transaction(symbol, qty,
                DataStore.market
                    .get(symbol).getPrice(),
                TransactionType.SELL));

        System.out.println("Stock Sold ✅");
    }
}