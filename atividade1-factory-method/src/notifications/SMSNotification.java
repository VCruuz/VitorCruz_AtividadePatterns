package notifications;

/**
 * Implementação concreta de notificação via SMS.
 */
public class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("SMSFactory enviando: \"" + message + "\"");
    }
}
