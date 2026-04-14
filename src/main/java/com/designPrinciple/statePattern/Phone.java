package com.designPrinciple.statePattern;

public class Phone {
    private PhoneState offState;
    private PhoneState lockedState;
    private PhoneState unlockedState;

    private PhoneState currentState;

    public Phone() {
        offState = new OffState(this);
        lockedState = new LockedState(this);
        unlockedState = new UnlockedState(this);
        currentState = offState;
    }

    public void setState(PhoneState state) { this.currentState = state; }

    // Action methods
    public void pressHome() { currentState.onHomePressed(); }
    public void swipe() { currentState.onSwipe(); }

    // State Getters
    public PhoneState getOffState() { return offState; }
    public PhoneState getLockedState() { return lockedState; }
    public PhoneState getUnlockedState() { return unlockedState; }
}