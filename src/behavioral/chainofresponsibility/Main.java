package behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger(LogLevel.INFO);
        Logger fileLogger = new FileLogger(LogLevel.WARNING);
        Logger errorLogger = new ErrorLogger(LogLevel.ERROR);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        consoleLogger.logMessage(LogLevel.INFO, "This is an INFO level message.");
        consoleLogger.logMessage(LogLevel.WARNING, "This is a WARNING level message.");
        consoleLogger.logMessage(LogLevel.ERROR, "This is an ERROR level message.");
    }
}
