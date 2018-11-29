package io.testing.java._05_arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arrayOfIntegers = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayTest.printArray(ArrayTest.reverseAlternative(arrayOfIntegers));
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 1; i <= array.length; i++) {
            result[array.length - i] = array[i - 1];
        }
        return result;  
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] reverseAlternative(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
        }
        return result;
    }

}
