package com.designpatterns.strategydesignpattern.paymentexample.strategy.controller;

import com.designpatterns.strategydesignpattern.paymentexample.strategy.service.CashPayment;
import com.designpatterns.strategydesignpattern.paymentexample.strategy.service.PaymentService;
import com.designpatterns.strategydesignpattern.paymentexample.strategy.service.PaymentStrategy;


public class Main {
	public static void main(String[] args) {
		PaymentStrategy strategy = new CashPayment();
		PaymentService paymentService = new PaymentService(strategy);
		paymentService.processPayment(2000);
	}
}
