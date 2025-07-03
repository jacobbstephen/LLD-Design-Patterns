package com.designpatterns.factorydesignpattern.notificationexample.withoutfactory.controller;

import com.designpatterns.factorydesignpattern.notificationexample.withoutfactory.service.NotificationService;

public class Main {
	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		notificationService.sendNotification("SMS");
	}
}
