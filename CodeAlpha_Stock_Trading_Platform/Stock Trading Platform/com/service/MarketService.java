package com.service;

import com.data.DataStore;

import java.util.Random;

public class MarketService {

    public void showMarketData() {
        DataStore.market.values()
                .forEach(System.out::println);
    }

    // Simulate price fluctuation
    public void updatePrices() {

        Random r = new Random();

        DataStore.market.values().forEach(stock -> {

            double change =
                (r.nextDouble() - 0.5) * 100;

            stock.setPrice(
                stock.getPrice() + change);
        });
    }
}