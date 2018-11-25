package io.testing.java._02_Obejcts;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Smith");
        Employee employee2 = new Employee("Adams");
        Employee employee3 = new Employee("John");

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
    }

}
