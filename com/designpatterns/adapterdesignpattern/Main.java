package com.designpatterns.adapterdesignpattern;

public class Main {
	public static void main(String[] args) {
		StripePayment stripe = new StripePayment();
		PaymentProcessor processor = new StripePaymentAdapter(stripe);
		processor.pay(200);
	}
}
