package io.testing.java._08_exceptions.exceptions;

public class WrongNumberException extends Exception {

    @Override
    public void printStackTrace() {
        System.err.println("You can't type numbers");
    }

}
