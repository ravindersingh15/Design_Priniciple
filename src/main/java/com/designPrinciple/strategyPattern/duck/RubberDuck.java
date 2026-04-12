package com.designPrinciple.strategyPattern.duck;

import com.designPrinciple.strategyPattern.behavior.FlyNoWay;
import com.designPrinciple.strategyPattern.behavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
