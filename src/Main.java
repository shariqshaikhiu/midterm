package src;

public class Main {
    public static void main(String[] args) {
        Question2 question2=new Question2();

        question2.printMessage();
        int sum= question2.calculateSum(2,7);
        System.out.println("Sum is: "+sum);
    }
}