package com.designpatterns.observerdesignpattern;

public class EmailSubscriber implements Subscriber{

	@Override
	public void update(String videoTitle) {
		System.out.println( "Received email: New video - " + videoTitle);
		
	}

}


