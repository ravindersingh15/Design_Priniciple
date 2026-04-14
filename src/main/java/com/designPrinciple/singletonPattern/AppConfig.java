package com.designPrinciple.singletonPattern;

public class AppConfig {
    private static volatile AppConfig instance;

    private String appName;
    private String version;

    private AppConfig() {
        this.appName = "Gemini-Project-Alpha";
        this.version = "1.0.0";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    public String getAppName() { return appName; }
    public void setAppName(String name) { this.appName = name; }
    public String getVersion() { return version; }
}
