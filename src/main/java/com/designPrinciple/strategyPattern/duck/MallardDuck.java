package com.designPrinciple.strategyPattern.duck;

import com.designPrinciple.strategyPattern.behavior.FlyWithWings;
import com.designPrinciple.strategyPattern.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
