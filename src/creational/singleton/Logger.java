package creational.singleton;

class Logger {
    private static Logger instance;

    private Logger() {

    }

    static synchronized Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    void log(String message) {
        System.out.println("Logger: " + message);
    }
}
