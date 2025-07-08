package com.designpatterns.facadedesignpattern.services;

public class PaymentService {
	public void validate(String card) {
		System.out.println("Validating the card: " + card);
	}
	public void charge(String card, double amount) {
        System.out.println("Charging ₹" + amount + " to card: " + card);
    }
}
