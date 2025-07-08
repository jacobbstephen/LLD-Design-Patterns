package com.designpatterns.facadedesignpattern.withfacade;

public class Main {
	public static void main(String[] args) {
		OrderFacade orderFacade = new OrderFacade();
		orderFacade.placeOrder("item123", "A", "Visa-1234");
	}
}


