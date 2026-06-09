package notifications;

/**
 * Interface que define o contrato para todos os tipos de notificação.
 */
public interface Notification {
    void send(String message);
}
