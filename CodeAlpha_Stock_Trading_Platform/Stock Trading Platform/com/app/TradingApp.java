package com.app;

import com.service.*;

import java.util.Scanner;

public class TradingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MarketService market =
                new MarketService();

        TradingService trading =
                new TradingService();

        PortfolioService portfolio =
                new PortfolioService();

        while (true) {

            System.out.println("\n1 Market Data");
            System.out.println("2 Buy");
            System.out.println("3 Sell");
            System.out.println("4 Portfolio");
            System.out.println("5 Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    market.updatePrices();
                    market.showMarketData();
                    break;

                case 2:
                    System.out.print("User: ");
                    String u = sc.next();

                    System.out.print("Stock: ");
                    String s = sc.next();

                    System.out.print("Qty: ");
                    int q = sc.nextInt();

                    trading.buyStock(u, s, q);
                    break;

                case 3:
                    System.out.print("User: ");
                    u = sc.next();

                    System.out.print("Stock: ");
                    s = sc.next();

                    System.out.print("Qty: ");
                    q = sc.nextInt();

                    trading.sellStock(u, s, q);
                    break;

                case 4:
                    System.out.print("User: ");
                    portfolio.viewPortfolio(sc.next());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}