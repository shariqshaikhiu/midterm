package src;

/**
 * Main class to test Question2 Class
 */
public class Main {
    /**
     * main() method
     * @param args
     */
    public static void main(String[] args) {
        Question2 question2=new Question2();

        question2.printMessage();
        int sum= question2.calculateSum(2,7);
        System.out.println("Sum is: "+sum);
    }
}