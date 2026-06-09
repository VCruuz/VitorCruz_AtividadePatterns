package service;

import factory.NotificationFactory;
import notifications.Notification;

/**
 * Serviço que usa uma NotificationFactory para criar e enviar notificações.
 * O código cliente não conhece qual implementação concreta será usada.
 */
public class NotificationService {

    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    /**
     * Cria a notificação via factory e realiza o envio da mensagem.
     */
    public void sendNotification(String message) {
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}
