package com.designPrinciple.statePattern;

// OffState.java
public class OffState implements PhoneState {
    Phone phone;
    public OffState(Phone phone) { this.phone = phone; }

    public void onHomePressed() {
        System.out.println("Screen wake up: Locked Screen.");
        phone.setState(phone.getLockedState());
    }
    public void onSwipe() { /* Do nothing while off */ }
}
