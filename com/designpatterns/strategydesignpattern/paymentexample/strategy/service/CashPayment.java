package com.designpatterns.strategydesignpattern.paymentexample.strategy.service;

public class CashPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of " + amount+ " done with Cash");
		
	}

}
