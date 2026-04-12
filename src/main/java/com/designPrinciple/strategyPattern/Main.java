package com.designPrinciple.strategyPattern;

import com.designPrinciple.strategyPattern.behavior.FlyWithWings;
import com.designPrinciple.strategyPattern.duck.Duck;
import com.designPrinciple.strategyPattern.duck.MallardDuck;
import com.designPrinciple.strategyPattern.duck.RubberDuck;

public class Main {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("----");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("---- Changing behavior at runtime ----");

        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.performFly();
    }
}
