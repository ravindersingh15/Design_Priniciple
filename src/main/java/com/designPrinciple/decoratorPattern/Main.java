package com.designPrinciple.decoratorPattern;

public class Main {
    public static void main(String[] args) {
        // Start with a core object
        Coffee myCoffee = new PlainCoffee();
        System.out.println(myCoffee.getDescription() + " | Cost: $" + myCoffee.getCost());

        // Wrap with Milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " | Cost: $" + myCoffee.getCost());

        // Wrap with Sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " | Cost: $" + myCoffee.getCost());

        // Wrap with Milk again (Double Milk)
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println("\nFinal Order: " + myCoffee.getDescription());
        System.out.println("Final Total: $" + myCoffee.getCost());
    }
}
