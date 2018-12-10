package io.testing.java._01_singleton;

public class TestSingleton extends Counter{

    private static TestSingleton testSingleton = null;

    public TestSingleton() {
        this.setId(counter++);
    }

    public static TestSingleton getTestSingleton() {
        if (testSingleton == null) {
            testSingleton = new TestSingleton();
        }
        return testSingleton;
    }

}
