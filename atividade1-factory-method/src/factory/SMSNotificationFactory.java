package factory;

import notifications.Notification;
import notifications.SMSNotification;

/**
 * Factory concreta que cria notificações do tipo SMS.
 */
public class SMSNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
