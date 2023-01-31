package transport;

public class CantStartDiagnosticsException extends Exception {
    private final Transport transport;

    public CantStartDiagnosticsException(String message, Transport transport) {
        super(message);
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }
}
