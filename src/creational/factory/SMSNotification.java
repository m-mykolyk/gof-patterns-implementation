package creational.factory;

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("An SMS notification was sent.");
    }
}
