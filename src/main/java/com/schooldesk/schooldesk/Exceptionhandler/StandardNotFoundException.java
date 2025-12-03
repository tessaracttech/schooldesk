package com.schooldesk.schooldesk.Exceptionhandler;

public class StandardNotFoundException extends RuntimeException {
    public StandardNotFoundException(String message) {
        super(message);
    }
}
