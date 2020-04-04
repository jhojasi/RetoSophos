package com.google.www.exceptions;

public class PossibleExceptions extends AssertionError {
    public PossibleExceptions (String message , Throwable throwable) {
        super(message,throwable);
    }
}
