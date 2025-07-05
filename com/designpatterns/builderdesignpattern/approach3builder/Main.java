package com.designpatterns.builderdesignpattern.approach3builder;

public class Main {
	public static void main(String[] args) {
		User user1 = new User.UserBuilder("user1_").age(21).address("123 Street XYZ").build();
		User user2 = new User.UserBuilder("user2_").phoneNumber("0123456789").address("123 Street XYZ").build();
		
		user1.showDetails();
		user2.showDetails();
	}
}
