package creational.factory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory emailNotification = new EmailNotificationFactory();
        emailNotification.sendNotification();

        NotificationFactory smsNotification = new SMSNotificationFactory();
        smsNotification.sendNotification();
    }
}
