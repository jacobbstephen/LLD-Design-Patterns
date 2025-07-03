package com.designpatterns.factorydesignpattern.notificationexample.withoutfactory.service;

public class PushNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending Push Notification");	
	}
}
