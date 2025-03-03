package creational.factory;

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("An Email notification was sent.");
    }
}
