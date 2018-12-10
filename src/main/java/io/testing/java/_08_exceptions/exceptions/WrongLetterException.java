package io.testing.java._08_exceptions.exceptions;

public class WrongLetterException extends Exception {

    @Override
    public void printStackTrace() {
        System.err.println("You can't type letters");
    }
}
