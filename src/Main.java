import java.sql.SQLOutput;

public class Main {
    public static void PrintMessage() {
        System.out.println("Welcome To Software Construction!");
    }
    public static void calculateSum(int a, int b){
        int sum=a+b;
    }

    public static void main(String[] args) {

        int a=2;
        int b=3;
        Main.calculateSum( a, b);
        Main.PrintMessage();
    }




}
