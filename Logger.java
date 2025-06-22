public class Logger {
    // Step 1: Private static instance of Logger
    private static Logger instance;

    // Step 2: Private constructor
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Optional: Example logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

