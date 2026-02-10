package com.service;

import com.bean.Holding;
import com.bean.User;
import com.data.DataStore;

public class PortfolioService {

    public void viewPortfolio(String userId) {

        User user = DataStore.users.get(userId);

        if (user == null) {
            System.out.println("No portfolio");
            return;
        }

        double total = 0;

        for (Holding h :
                user.getPortfolio().values()) {

            double currentPrice =
                DataStore.market
                    .get(h.getStockSymbol())
                    .getPrice();

            double value =
                currentPrice * h.getQuantity();

            total += value;

            System.out.println(
                h.getStockSymbol() +
                " Qty:" + h.getQuantity() +
                " Value:₹" + value);
        }

        System.out.println(
            "Total Portfolio Value: ₹" + total);
    }
}