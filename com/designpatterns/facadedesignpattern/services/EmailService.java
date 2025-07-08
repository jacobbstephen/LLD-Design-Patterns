package com.designpatterns.facadedesignpattern.services;

public class EmailService {
	public void sendConfirmation(String user) {
        System.out.println("Sending confirmation email to " + user);
    }
}
