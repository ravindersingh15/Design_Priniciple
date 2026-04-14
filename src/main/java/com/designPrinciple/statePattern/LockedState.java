package com.designPrinciple.statePattern;

// LockedState.java
public class LockedState implements PhoneState {
    Phone phone;
    public LockedState(Phone phone) { this.phone = phone; }

    public void onHomePressed() {
        System.out.println("Screen going to sleep...");
        phone.setState(phone.getOffState());
    }
    public void onSwipe() {
        System.out.println("Unlocked! Home screen displayed.");
        phone.setState(phone.getUnlockedState());
    }
}
