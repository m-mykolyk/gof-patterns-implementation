package behavioral.chainofresponsibility;

class ErrorLogger extends Logger {
    ErrorLogger(int logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    void write(String message) {
        System.out.println("Error Logger: " + message);
    }
}
