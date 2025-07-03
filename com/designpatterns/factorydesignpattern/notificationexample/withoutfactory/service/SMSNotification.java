package com.designpatterns.factorydesignpattern.notificationexample.withoutfactory.service;

public class SMSNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending SMS Notification");
		
	}
}
