package com.designpatterns.adapterdesignpattern;

public class StripePaymentAdapter implements PaymentProcessor {
	StripePayment stripe;
	
	public StripePaymentAdapter(StripePayment stripe) {
		this.stripe = stripe;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Building an adapter to ease the payment process with stripe ");
		stripe.makePayment(amount);
		
	}

}

