package io.testing.java._04_nonAccess;

public class InstanceCounter {

    private static int counter = 0;

    protected static int getCounter() {
        return counter;
    }

    private static void incCounter() {
        counter++;
    }

    InstanceCounter() {
        incCounter();
    }

}
