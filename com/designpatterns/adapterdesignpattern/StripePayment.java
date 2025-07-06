package com.designpatterns.adapterdesignpattern;

public class StripePayment {
	public void makePayment(double amount) {
		System.out.println("Payment of $" + amount + " is done with Stripe");
	}
}
	
