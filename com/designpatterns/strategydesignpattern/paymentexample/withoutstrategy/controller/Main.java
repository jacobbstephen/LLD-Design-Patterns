package com.designpatterns.strategydesignpattern.paymentexample.withoutstrategy.controller;

import com.designpatterns.strategydesignpattern.paymentexample.withoutstrategy.service.PaymentService;

public class Main {
	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
		paymentService.processPayment("CREDIT_CARD", 2000);
	}
}
