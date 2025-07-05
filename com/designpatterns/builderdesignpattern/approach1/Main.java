package com.designpatterns.builderdesignpattern.approach1;

public class Main {
	public static void main(String[] args) {
		User user = new User("user_1", "user@gmail.com", null, null, 25);
		user.showDetails();
	}
}
