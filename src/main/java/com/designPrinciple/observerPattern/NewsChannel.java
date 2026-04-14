package com.designPrinciple.observerPattern;

// NewsChannel.java
public class NewsChannel implements NewsObserver {
    private String channelName;

    public NewsChannel(String name) {
        this.channelName = name;
    }

    @Override
    public void update(String breakingNews) {
        System.out.println("[" + channelName + " LIVE]: " + breakingNews);
    }
}