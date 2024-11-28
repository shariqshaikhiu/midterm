//Answer no 2
public class Main {

    // Method that prints a welcome message
    public static void printMessage() {
        System.out.println("Welcome to Software Construction");
    }

    // Method that calculates the sum of two integers
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Calling the printMessage method
        printMessage();

        // Calling the calculateSum method with two integers
        int sum = calculateSum(5, 10);

        // Outputting the result of the sum calculation
        System.out.println("The sum of 5 and 10 is: " + sum);
    }
}
