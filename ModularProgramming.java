public class ModularProgramming {

    /**
     * Modular progrmming
     * @param operand1,operand2
     * @return sum
     */

    //print message method
    public void printMessage() {
        System.out.println("Welcome to Software Construction!");
    }

    //calculate sum method
    public double calculateSum(double operand1, double operand2){
            return operand1+operand2;
        }







    //main class to call methods
    public static void main(String[] args){

        ModularProgramming MP = new ModularProgramming();
        MP.printMessage();
        System.out.println(MP.calculateSum(3,6));
    }
}
