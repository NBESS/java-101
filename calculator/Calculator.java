public class Calculator {
    // Instance field

    // Constructor method
    public Calculator() {
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

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(12, 7));

    }
}