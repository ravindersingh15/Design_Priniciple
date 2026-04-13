package com.designPrinciple.factoryPattern.factoryPattern;

class CreditCardPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}