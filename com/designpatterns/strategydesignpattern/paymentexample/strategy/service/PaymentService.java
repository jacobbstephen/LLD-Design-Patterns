package com.designpatterns.strategydesignpattern.paymentexample.strategy.service;

public class PaymentService {
	PaymentStrategy strategy;

	public PaymentService(PaymentStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void processPayment(double amount) {
		strategy.pay(amount);
	}
}
