package behavioral.chainofresponsibility;

class ConsoleLogger extends Logger {
    ConsoleLogger(int logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    void write(String message) {
        System.out.println("Console Logger: " + message);
    }
}
