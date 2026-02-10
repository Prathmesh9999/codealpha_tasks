package com.bean;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {

    private String userId;

    private Map<String, Holding> portfolio =
            new HashMap<>();

    private List<Transaction> transactions =
            new ArrayList<>();

    public User(String userId) {
        this.userId = userId;
    }

    public Map<String, Holding> getPortfolio() {
        return portfolio;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}