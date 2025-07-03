package com.designpatterns.factorydesignpattern.notificationexample.withoutfactory.service;

public class NotificationService {
	public void sendNotification(String type) {
		if(type.equalsIgnoreCase("SMS")) {
			Notification sms = new SMSNotification();
			sms.notifyUser();
			
		}else if(type.equalsIgnoreCase("PUSH")) {
			Notification push = new PushNotification();
			push.notifyUser();
			
		}else if(type.equalsIgnoreCase("EMAIL")) {
			Notification email = new EmailNotification();
			email.notifyUser();
			
		}else {
			System.out.println("Invalid Notification Type");
		}
	}
}
