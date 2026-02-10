package com.data;

import com.bean.Stock;
import com.bean.User;

import java.util.HashMap;
import java.util.Map;

public class DataStore {

    public static Map<String, Stock> market =
            new HashMap<>();

    public static Map<String, User> users =
            new HashMap<>();

    static {
        market.put("TCS",
            new Stock("TCS","Tata Consultancy",3500));

        market.put("INFY",
            new Stock("INFY","Infosys",1500));

        market.put("RELIANCE",
            new Stock("RELIANCE","Reliance Ltd",2500));
    }
}