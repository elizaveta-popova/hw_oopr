package transport;

public class LicenceException extends Exception {
    private Driver driver;

    public LicenceException(String message, Driver driver) {
        super(message);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}
