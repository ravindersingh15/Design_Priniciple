package com.designPrinciple.factoryPattern.factoryPattern;

public class Main {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment("credit");
        payment.pay(1000);

        payment = PaymentFactory.getPayment("paypal");
        payment.pay(2000);
    }
}