package com.designpatterns.factorydesignpattern.notificationexample.factory.controller;

import com.designpatterns.factorydesignpattern.notificationexample.factory.service.NotificationService;

public class Main {

	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		notificationService.sendNotification("EMAIL");

	}

}
