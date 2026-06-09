package factory;

import notifications.Notification;
import notifications.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
