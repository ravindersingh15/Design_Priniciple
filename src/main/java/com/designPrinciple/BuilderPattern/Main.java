package com.designPrinciple.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        // 1. Create a user with only mandatory fields
        User basicUser = new User.UserBuilder("John", "Doe")
                .build();

        // 2. Create a user with mandatory + some optional fields
        User contactUser = new User.UserBuilder("Jane", "Smith")
                .phone("555-1234")
                .age(28)
                .build();

        // 3. Create a full user profile (Notice the "Fluent" chaining)
        User fullUser = new User.UserBuilder("Alice", "Wonder")
                .age(30)
                .phone("555-9876")
                .address("123 Rabbit Hole Lane")
                .build();

        System.out.println(basicUser);
        System.out.println(contactUser);
        System.out.println(fullUser);
    }
}
