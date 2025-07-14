package com.designpatterns.chainofresponsiblitydesignpattern;

public class Main {
	public static void main(String[] args) {
		Handler basicHandler = new BasicHandler();
		Handler advancedHandler = new AdvancedHandler();
		basicHandler.setNext(advancedHandler);
		
		Request req1 = new Request(1000);
		Request req2 = new Request(100);
		
		basicHandler.handle(req1);// Handled by advanced Handler
		basicHandler.handle(req2);// Handled by basic Handler
	}
}
