package com.designpatterns.builderdesignpattern.approach2;

public class Main {
	
	public static void main(String[] args) {
		User user1 = new User("user1_");
		User user2 = new User("user2_", "user2@gmail.com");
		user1.showDetails();
		user2.showDetails();
	}
}
