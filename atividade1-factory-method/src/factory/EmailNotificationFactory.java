package factory;

import notifications.EmailNotification;
import notifications.Notification;

/**
 * Factory concreta que cria notificações do tipo Email.
 */
public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
