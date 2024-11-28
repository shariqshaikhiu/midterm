package org.example;

/**
 * The {@code Methods} class provides basic utility methods
 * such as printing a message and calculating the sum of two integers.
 */
public class Methods {

    /**
     * Prints a welcome message to the console.
     */
    public void printMessage() {
        System.out.println("Welcome to Software Construction!");
    }

    /**
     * Calculates the sum of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of {@code a} and {@code b}
     */
    public int calculateSum(int a, int b) {
        // Calculate the sum of a and b
        int result = a + b;
        return result;
    }
}