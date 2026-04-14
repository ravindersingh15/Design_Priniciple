package com.designPrinciple.statePattern;

// UnlockedState.java
public class UnlockedState implements PhoneState {
    Phone phone;
    public UnlockedState(Phone phone) { this.phone = phone; }

    public void onHomePressed() {
        System.out.println("Closing apps and locking screen...");
        phone.setState(phone.getOffState());
    }
    public void onSwipe() {
        System.out.println("Navigating through apps...");
    }
}
