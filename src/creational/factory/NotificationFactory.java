package creational.factory;

abstract class NotificationFactory {
    abstract Notification createNotification();

    void sendNotification() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}
