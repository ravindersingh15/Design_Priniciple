package com.designPrinciple.factoryPattern.factoryPattern;

class PaymentFactory {
    public static Payment getPayment(String type) {
        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        }
        throw new IllegalArgumentException("Invalid payment type");
    }
}