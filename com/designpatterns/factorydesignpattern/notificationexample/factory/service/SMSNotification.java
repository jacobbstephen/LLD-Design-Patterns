package com.designpatterns.factorydesignpattern.notificationexample.factory.service;


public class SMSNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending SMS Notification  via factory method");
		
	}
}