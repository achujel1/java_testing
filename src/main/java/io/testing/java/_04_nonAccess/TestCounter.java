package io.testing.java._04_nonAccess;

public class TestCounter {

    public static void main(String[] args) {
        System.out.println("Getting counter: " + InstanceCounter.getCounter());

        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();


        System.out.println("Getting counter: " + InstanceCounter.getCounter());
    }

}
