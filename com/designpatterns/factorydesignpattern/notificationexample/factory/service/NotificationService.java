package com.designpatterns.factorydesignpattern.notificationexample.factory.service;

public class NotificationService {
    public void sendNotification(String type) {
        Notification notification = NotificationFactory.createNotification(type);
        notification.notifyUser();
    }
}

