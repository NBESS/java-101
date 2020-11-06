public class Calculator {
    // Instance field

    // Constructor method
    public Calculator() {
    }

    // toString method
    public String toString() {
        return "The calculator has various methods that can be used to perform mathematical operations"
    }

    // Add method
    public int add(int numOne, int numTwo) {
        int result = numOne + numTwo;

        System.out.println(numOne + " + " + numTwo + " = " + result);
        return result;
    }
 
    // Subtract method
    public int subtract(int numOne, int numTwo) {
        int result = numOne - numTwo;

        System.out.println(numOne + " - " + numTwo + " = " + result);
        return result;
    }

    // Multiply method
    public int multiply(int numOne, int numTwo) {
        int result = numOne * numTwo;

        System.out.println(numOne + " * " + numTwo + " = " + result);
        return result;
    }

    // Divide method
    public int divide(int numOne, int numTwo) {
        int result = numOne / numTwo;

        System.out.println(numOne + " / " + numTwo + " = " + result);
        return result;
    }

    // Modulo method
    public int modulo(int numOne, int numTwo) {
        int result = numOne % numTwo;

        System.out.println(numOne + " % " + numTwo + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        myCalculator.add(5, 7);
        myCalculator.subtract(12, 7);
        myCalculator.multiply(100, 4);
        myCalculator.divide(100, 4);
        myCalculator.modulo(100, 2);

    }
}