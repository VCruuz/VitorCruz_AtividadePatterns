package factory;

import notifications.Notification;

/**
 * Classe abstrata que define o Factory Method.
 * Cada subclasse é responsável por instanciar o tipo correto de notificação.
 */
public abstract class NotificationFactory {

    /**
     * Factory Method — deve ser implementado pelas subclasses.
     */
    public abstract Notification createNotification();
}
