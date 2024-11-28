package org.example;

/**
 * The Main class serves as the entry point for the application.
 * It demonstrates basic usage of the Methods class.
 */
public class Main {

    /**
     * The main method is the entry point of the application.
     * It creates an instance of the Methods class and calls its methods.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Create an instance of the Methods class
        Methods methods = new Methods();

        // Call the printMessage method
        methods.printMessage();

        // Call the calculateSum method with two integers
        int sum = methods.calculateSum(5, 10);
        System.out.println("The sum is: " + sum);
    }
}