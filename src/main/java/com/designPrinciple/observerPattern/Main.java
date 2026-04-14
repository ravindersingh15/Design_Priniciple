package com.designPrinciple.observerPattern;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create the News Agency (Subject)
        NewsAgency reuters = new NewsAgency();

        // Create different News Channels (Observers)
        NewsChannel bbc = new NewsChannel("BBC");
        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel alJazeera = new NewsChannel("Al Jazeera");

        // Channels subscribe to the agency
        reuters.addChannel(bbc);
        reuters.addChannel(cnn);
        reuters.addChannel(alJazeera);

        // Agency broadcasts news - all 3 channels get it
        reuters.broadcastNews("Global peace treaty signed in Geneva!");

        // CNN decides to stop following this agency
        reuters.removeChannel(cnn);

        // Next update - only BBC and Al Jazeera get it
        System.out.println("\n--- Next Update ---");
        reuters.broadcastNews("New discovery on Mars suggests liquid water.");
    }
}
