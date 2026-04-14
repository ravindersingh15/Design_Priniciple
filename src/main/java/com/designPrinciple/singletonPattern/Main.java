package com.designPrinciple.singletonPattern;

public class Main {
    public static void main(String[] args) {
        // Try to get the instance for the first time
        AppConfig config1 = AppConfig.getInstance();
        System.out.println("Config 1 App Name: " + config1.getAppName());

        // Change a value using the first reference
        config1.setAppName("Updated-Singleton-App");

        // Try to get the instance again
        AppConfig config2 = AppConfig.getInstance();

        // Verify both references point to the same object
        System.out.println("Config 2 App Name: " + config2.getAppName());

        if (config1 == config2) {
            System.out.println("SUCCESS: Both variables point to the same instance.");
        } else {
            System.out.println("FAILURE: Different instances exist.");
        }
    }
}
