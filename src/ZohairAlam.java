public class ZohairAlam {

    public ZohairAlam(){

    }

    //Method printing Welcome to software construction
    public static void printMessage() {
        System.out.println("Welcome to Software Construction");
    }

    //Method returning sum of numbers
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    //Main method
    public static void main(String[] args) {
        printMessage();
        int sum = calculateSum(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);
    }
}


