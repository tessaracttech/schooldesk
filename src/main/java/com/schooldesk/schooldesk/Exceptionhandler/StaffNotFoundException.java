package com.schooldesk.schooldesk.Exceptionhandler;

public class StaffNotFoundException extends RuntimeException {
    public StaffNotFoundException(String message) {
        super(message);
    }
}
