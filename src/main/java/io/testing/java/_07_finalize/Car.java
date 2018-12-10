package io.testing.java._07_finalize;

public class Car {

    public Car() {
        System.out.println("Starting the car");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Closing the engine");
        super.finalize();
    }
}
