package com.service;

public class PaymentService {

    public boolean makePayment(String userId, double amount) {

        System.out.println(
            "Processing payment ₹" + amount +
            " for user " + userId);

        System.out.println("Payment Successful ✅");
        return true;
    }
}