package com.designPrinciple.factoryPattern.strategyPattern2;

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}