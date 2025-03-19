package behavioral.chainofresponsibility;

class FileLogger extends Logger {
    FileLogger(int logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    void write(String message) {
        System.out.println("File Logger: " + message);
    }
}
