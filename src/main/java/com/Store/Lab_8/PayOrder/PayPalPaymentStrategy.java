package com.Store.Lab_8.PayOrder;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public void pay_order(double price) {

    }

    @Override
    public String toString() {
        return "PayPal";
    }
}
