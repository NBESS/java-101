public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i<= 100; i++) {
            // if number is divisible by 3 and 5 print FizzBuzz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            // if number is divisible by 5 print Buzz
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            // if number is divisible by 3 print Fizz
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            // print number
            } else {
                System.out.println(i);
            }
        }   
    }

}