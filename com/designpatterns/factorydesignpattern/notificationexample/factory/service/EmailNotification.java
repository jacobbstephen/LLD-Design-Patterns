package com.designpatterns.factorydesignpattern.notificationexample.factory.service;



public class EmailNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending Email Notification  via factory method");
		
	}
}
