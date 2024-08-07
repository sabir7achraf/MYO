package com.example.oym.Exception;

public class EmployeNotFoundException extends RuntimeException {
    public EmployeNotFoundException(String message) {
        super(message);
    }

}
