package com.designpatterns.strategydesignpattern.paymentexample.withoutstrategy.service;

public class PaymentService {
	public void processPayment(String paymentType, double amount) {
		if("CREDIT_CARD".equals(paymentType)) System.out.println("Payment of " + amount+ " done with Credit card");
		else if("DEBIT_CARD".equals(paymentType)) System.out.println("Payment of " + amount+ " done with Debit card");
		else if("CASH".equals(paymentType)) System.out.println("Payment of " + amount+ " done with Cash");
		else if("UPI".equals(paymentType)) System.out.println("Payment of " + amount+ " done with UPI");
		else System.out.println("Unknown Payment Method");
	}
}
