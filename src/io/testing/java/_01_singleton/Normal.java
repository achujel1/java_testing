package io.testing.java._01_singleton;

public class Normal {

    public static void main(String[] args) {
        Regular regular1 = new Regular();
        Regular regular2 = new Regular();
        Regular regular3 = new Regular();
        Regular regular4 = new Regular();
        System.out.println(regular1.getId());
        System.out.println(regular2.getId());
        System.out.println(regular3.getId());
        System.out.println(regular4.getId());

        TestSingleton testSingleton1 = TestSingleton.getTestSingleton();
        TestSingleton testSingleton2 = TestSingleton.getTestSingleton();
        TestSingleton testSingleton3 = TestSingleton.getTestSingleton();
        TestSingleton testSingleton4 = TestSingleton.getTestSingleton();
        System.out.println(testSingleton1.getId());
        System.out.println(testSingleton2.getId());
        System.out.println(testSingleton3.getId());
        System.out.println(testSingleton4.getId());
    }

}
