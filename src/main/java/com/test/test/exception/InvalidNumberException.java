package com.test.test.exception;

public class InvalidNumberException extends IllegalArgumentException{

    public InvalidNumberException(String message) {
        super(message);
    }
}
