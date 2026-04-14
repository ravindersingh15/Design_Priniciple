package com.designPrinciple.statePattern;

public class Main {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        myPhone.swipe();      // Nothing happens (screen is off)
        myPhone.pressHome();  // Wakes up to Lock Screen
        myPhone.swipe();      // Unlocks phone
        myPhone.swipe();      // Navigates apps
        myPhone.pressHome();  // Goes back to sleep
    }
}