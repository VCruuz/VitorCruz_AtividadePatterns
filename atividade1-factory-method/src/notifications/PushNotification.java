package notifications;

/**
 * Implementação concreta de notificação via Push.
 */
public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("PushFactory enviando: \"" + message + "\"");
    }
}
