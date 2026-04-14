package com.designPrinciple.BuilderPattern;

public class User {
    // All fields are final (Immutable)
    private final String firstName;    // Mandatory
    private final String lastName;     // Mandatory
    private final int age;             // Optional
    private final String phone;        // Optional
    private final String address;      // Optional

    // Private constructor: Takes the Builder as input
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getters only (No Setters to preserve immutability)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + ", Age: " + age +
                ", Phone: " + phone + ", Address: " + address;
    }

    // --- STATIC INNER BUILDER CLASS ---
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age = 0;
        private String phone = "";
        private String address = "";

        // Constructor for Mandatory fields
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Methods for Optional fields (Returning 'this' enables chaining)
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        // The "Build" method to return the final User object
        public User build() {
            return new User(this);
        }
    }
}