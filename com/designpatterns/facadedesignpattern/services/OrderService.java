package com.designpatterns.facadedesignpattern.services;

public class OrderService {
	public void createOrder(String item, String user) {
		System.out.println("Creating order for " + user  + " - " + item);
	}
}
