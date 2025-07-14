package com.designpatterns.chainofresponsiblitydesignpattern;

public class BasicHandler extends Handler {

	@Override
	public void handle(Request request) {
		if(request.getAmount() < 500) System.out.println("Handled by basic handler");
		else if(nextHandler != null) nextHandler.handle(request);
		
	}

}
