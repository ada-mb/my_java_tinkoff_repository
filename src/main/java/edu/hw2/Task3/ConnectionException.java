package edu.hw2.Task3;

public class ConnectionException extends RuntimeException {
    public ConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectionException() {
        //super(); (вызывается автоматически)
    }
}
