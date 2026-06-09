package service;

import factory.NotificationFactory;
import notifications.Notification;

public class NotificationService {

    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void sendNotification(String message) {
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}
