package factory;

import notifications.Notification;
import notifications.PushNotification;

/**
 * Factory concreta que cria notificações do tipo Push.
 */
public class PushNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
