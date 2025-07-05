package com.designpatterns.builderdesignpattern.approach1;

public class User {
	private String username;
	private String address;
	private String email;
	private String phoneNumber;
	private int age;
	
	public User(String username, String email, String phoneNumber, String address, int age) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
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
