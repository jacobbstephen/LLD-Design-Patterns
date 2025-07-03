package com.designpatterns.factorydesignpattern.notificationexample.factory.service;


public class PushNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending Push Notification via factory method");	
	}
}
