import factory.EmailNotificationFactory;
import factory.PushNotificationFactory;
import factory.SMSNotificationFactory;
import service.NotificationService;

/**
 * Classe principal — demonstra o uso do padrão Factory Method.
 * O cliente trabalha apenas com NotificationService e as factories,
 * sem instanciar diretamente nenhuma notificação concreta.
 */
public class Main {

    public static void main(String[] args) {
        String message = "Bem-vindo ao sistema!";

        // Cada service recebe uma factory diferente — polimorfismo em ação
        NotificationService emailService = new NotificationService(new EmailNotificationFactory());
        NotificationService smsService   = new NotificationService(new SMSNotificationFactory());
        NotificationService pushService  = new NotificationService(new PushNotificationFactory());

        emailService.sendNotification(message);
        smsService.sendNotification(message);
        pushService.sendNotification(message);
    }
}
