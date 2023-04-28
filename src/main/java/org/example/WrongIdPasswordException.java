package org.example;
public class WrongIdPasswordException extends RuntimeException {
    public WrongIdPasswordException() {
        super();
    }

    public WrongIdPasswordException(String message) {
        super(message);
    }
}
