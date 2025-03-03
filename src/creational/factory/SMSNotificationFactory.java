package creational.factory;

class SMSNotificationFactory extends NotificationFactory {
    @Override
    Notification createNotification() {
        return new SMSNotification();
    }
}
