package com.designPrinciple.factoryPattern.strategyPattern2;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy strategy = new CreditCardPayment(); // client chooses
        PaymentGateway gateway = new PaymentGateway(strategy);
        gateway.processPayment(1000);

        strategy = new PayPalPayment();
        gateway = new PaymentGateway(strategy);
        gateway.processPayment(2000);
    }
}