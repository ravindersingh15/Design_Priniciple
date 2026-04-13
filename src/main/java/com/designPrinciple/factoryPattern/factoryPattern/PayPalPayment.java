package com.designPrinciple.factoryPattern.factoryPattern;

class PayPalPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}