package behavioral.chainofresponsibility;

abstract class Logger {
    int logLevel;
    Logger nextLogger;

    void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    void logMessage(int logLevel, String message) {
        if (this.logLevel <= logLevel) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(logLevel, message);
        }
    }

    abstract void write(String message);
}
