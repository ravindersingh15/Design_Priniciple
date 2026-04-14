package com.designPrinciple.observerPattern;

// NewsAgency.java
import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<NewsObserver> channels = new ArrayList<>();
    private String latestNews;

    // Add a channel to the notification list
    public void addChannel(NewsObserver channel) {
        channels.add(channel);
    }

    // Remove a channel from the list
    public void removeChannel(NewsObserver channel) {
        channels.remove(channel);
    }

    // The heart of the pattern: Notify everyone in the list
    public void broadcastNews(String news) {
        this.latestNews = news;
        for (NewsObserver channel : channels) {
            channel.update(latestNews);
        }
    }
}