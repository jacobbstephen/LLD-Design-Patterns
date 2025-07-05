package com.designpatterns.builderdesignpattern.approach2;

public class User {
    private String username;
    private String address;
    private String email;
    private String phoneNumber;
    private int age;
    // Constructor with only required field
    public User(String username) {
        this(username, null);
    }
    // Constructor with 1 optional field
    public User(String username, String email) {
        this(username, null, email);
    }
    // Constructor with 2 optional fields
    public User(String username, String address, String email) {
        this(username, address, email, null);
    }
    // Constructor with 3 optional fields
    public User(String username, String address, String email, String phoneNumber) {
        this(username, address, email, phoneNumber, 0);
    }
 // Constructor with all fields
    public User(String username, String address, String email, String phoneNumber, int age) {
        this.username = username;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    public void showDetails() {
		System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
	}
}
