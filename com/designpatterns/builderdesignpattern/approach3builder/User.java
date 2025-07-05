package com.designpatterns.builderdesignpattern.approach3builder;

public class User {
	// Required fields
	private final String username;
	// Optional fields
    private final String address;
    private final String email;
    private final String phoneNumber;
    private final int age;
    
    private User(UserBuilder builder) {
    	this.username = builder.username;
    	this.address = builder.address;
    	this.email = builder.email;
    	this.phoneNumber = builder.phoneNumber;
    	this.age = builder.age;
    }
    
    // Static nested Builder class
    public static class UserBuilder{
    	// Required fields
    	private final String username;
    	// Optional fields
        private String address;
        private String email;
        private String phoneNumber;
        private int age;
        
        public UserBuilder(String username) {
        	this.username = username;
        }
        
        // Chained setter methods for optional fields
        public UserBuilder address(String address) {
        	this.address = address;
        	return this;
        }
        
        public UserBuilder email(String email) {
        	this.email = email;
        	return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
        	this.phoneNumber = phoneNumber;
        	return this;
        }
        
        public UserBuilder age(int age) {
        	this.age = age;
        	return this;
        }
        
        public User build() {
        	return new User(this);
        }
    	
    }
    
    public void showDetails() {
		System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
	} 
}
