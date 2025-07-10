package com.designpatterns.observerdesignpattern;

public class MobileSubscriber implements Subscriber {

	@Override
	public void update(String videoTitle) {
		System.out.println("Received mobile notification: New video - " + videoTitle);
		
	}

}
