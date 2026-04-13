package com.designPrinciple.factoryPattern.strategyPattern2;

class PaymentGateway {
    private PaymentStrategy strategy;

    public PaymentGateway(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(int amount) {
        strategy.pay(amount);
    }
}