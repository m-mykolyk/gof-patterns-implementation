package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is a first log message.");
        logger2.log("This is a second log message.");

        System.out.println("logger1 hash code: " + logger1.hashCode() + "\nlogger2 hash code: " + logger2.hashCode());
    }
}
