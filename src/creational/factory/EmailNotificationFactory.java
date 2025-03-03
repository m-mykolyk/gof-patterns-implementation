package creational.factory;

class EmailNotificationFactory extends NotificationFactory {
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}
