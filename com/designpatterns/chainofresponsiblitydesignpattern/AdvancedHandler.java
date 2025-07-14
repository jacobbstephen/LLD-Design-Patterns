package com.designpatterns.chainofresponsiblitydesignpattern;

public class AdvancedHandler extends Handler {

	@Override
	public void handle(Request request) {
		System.out.println("Handled by Advanced handler");
		
	}

}
