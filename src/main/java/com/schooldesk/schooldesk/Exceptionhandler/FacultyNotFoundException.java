package com.schooldesk.schooldesk.Exceptionhandler;

public class FacultyNotFoundException extends RuntimeException {
    public FacultyNotFoundException(String message) {
        super(message);
    }
}
